package org.comp3607.model;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Carries one event, its timing, and its event-specific data. Owner: Shared.
 */
public record TelemetryEvent(EventType type, long timestampMs, long sessionOffsetMs, Map<String, Object> data) {
    public TelemetryEvent {
        data = Collections.unmodifiableMap(new LinkedHashMap<>(data));
    }
}
