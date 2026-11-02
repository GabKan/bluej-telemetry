package org.comp3607.api;

import org.comp3607.model.TelemetryEvent;

/**
 * Accepts telemetry events from event producers. Owner: Shared.
 */
public interface EventSink {
    void accept(TelemetryEvent event);
}
