package org.comp3607.collector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.comp3607.model.EventType;
import org.comp3607.model.SessionMetadata;
import org.comp3607.model.TelemetryEvent;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class CompileEventListenerTest {

    @Test
    void compileStartedEventIsAvailableFromEventSource() {
        BufferedEventSink source = new BufferedEventSink(
                new SessionMetadata("session-1", "student-1", 1_000L, 0L));
        CompileEventListener listener = new CompileEventListener(source, new TelemetryEventFactory());

        listener.onCompileStarted("HelloWorld", 1_250L, 250L);

        TelemetryEvent event = source.snapshot().get(0);
        assertEquals(1, source.snapshot().size());
        assertEquals(EventType.COMPILE_START, event.getType());
        assertEquals(1_250L, event.getTimestampMs());
        assertEquals(250L, event.getSessionOffsetMs());
        Map<String, Object> expectedData = new HashMap<>();
        expectedData.put("className", "HelloWorld");
        assertEquals(expectedData, event.getData());
    }

    @Test
    void compileFinishedEventIsAvailableFromEventSource() {
        BufferedEventSink source = new BufferedEventSink(
                new SessionMetadata("session-1", "student-1", 1_000L, 0L));
        CompileEventListener listener = new CompileEventListener(source, new TelemetryEventFactory());

        List<String> errors = new ArrayList<>();
        errors.add("Line 3: syntax error");
        listener.onCompileFinished(false, errors, 1_500L, 500L);

        TelemetryEvent event = source.snapshot().get(0);
        assertEquals(EventType.COMPILE_FINISH, event.getType());
        assertEquals(false, event.getData().get("success"));
        assertEquals(errors, event.getData().get("errors"));
    }

    @Test
    void compileFactoryRejectsNonCompilationEvents() {
        TelemetryEventFactory factory = new TelemetryEventFactory();

        boolean exceptionThrown = false;
        try {
            factory.createCompileEvent(EventType.PROJECT_OPEN, 1L, 0L, new HashMap<>());
        } catch (IllegalArgumentException exception) {
            exceptionThrown = true;
            assertEquals("Not a compilation event type: PROJECT_OPEN", exception.getMessage());
        }
        assertTrue(exceptionThrown);
    }
}