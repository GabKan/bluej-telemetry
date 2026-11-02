package org.comp3607.collector;

import java.util.List;
import java.util.Map;
import org.comp3607.api.EventSink;

/**
 * Receives notifications about BlueJ compilation events. Owner: Member A.
 * Pattern: Observer
 */
public class CompileEventListener {
    private final EventSink eventSink;
    private final TelemetryEventFactory eventFactory;

    public CompileEventListener(EventSink eventSink, TelemetryEventFactory eventFactory) {
        this.eventSink = eventSink;
        this.eventFactory = eventFactory;
    }

    public void onCompileStarted(String className, long timestampMs, long sessionOffsetMs) {
        throw new UnsupportedOperationException("TODO Member A");
    }

    public void onCompileFinished(
            boolean success,
            List<Map<String, Object>> errors,
            long timestampMs,
            long sessionOffsetMs) {
        throw new UnsupportedOperationException("TODO Member A");
    }
}
