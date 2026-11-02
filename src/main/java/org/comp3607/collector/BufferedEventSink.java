package org.comp3607.collector;

import java.util.ArrayList;
import java.util.List;
import org.comp3607.api.EventSink;
import org.comp3607.api.EventSource;
import org.comp3607.model.SessionMetadata;
import org.comp3607.model.TelemetryEvent;

/**
 * Buffers telemetry events and exposes them with session metadata. Owner: Member A.
 */
public class BufferedEventSink implements EventSink, EventSource {
    private final List<TelemetryEvent> events = new ArrayList<>();
    private SessionMetadata metadata;

    public BufferedEventSink(SessionMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public void accept(TelemetryEvent event) {
        throw new UnsupportedOperationException("TODO Member A");
    }

    @Override
    public List<TelemetryEvent> snapshot() {
        throw new UnsupportedOperationException("TODO Member A");
    }

    @Override
    public SessionMetadata metadata() {
        throw new UnsupportedOperationException("TODO Member A");
    }

    public void updateMetadata(SessionMetadata updatedMetadata) {
        throw new UnsupportedOperationException("TODO Member A");
    }
}
