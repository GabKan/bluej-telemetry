package org.comp3607.collector;

import org.comp3607.api.EventSink;

/**
 * Receives notifications about BlueJ class lifecycle events. Owner: Member A.
 * Pattern: Observer
 */
public class ClassEventListener {
    private final EventSink eventSink;
    private final TelemetryEventFactory eventFactory;

    public ClassEventListener(EventSink eventSink, TelemetryEventFactory eventFactory) {
        this.eventSink = eventSink;
        this.eventFactory = eventFactory;
    }

    public void onClassCreated(String className, long timestampMs, long sessionOffsetMs) {
        throw new UnsupportedOperationException("TODO Member A");
    }

    public void onClassDeleted(String className, long timestampMs, long sessionOffsetMs) {
        throw new UnsupportedOperationException("TODO Member A");
    }

    public void onClassModified(String className, long timestampMs, long sessionOffsetMs) {
        throw new UnsupportedOperationException("TODO Member A");
    }
}
