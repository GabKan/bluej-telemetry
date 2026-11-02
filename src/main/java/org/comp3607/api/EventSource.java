package org.comp3607.api;

import java.util.List;
import org.comp3607.model.SessionMetadata;
import org.comp3607.model.TelemetryEvent;

/**
 * Exposes captured events and their session metadata. Owner: Shared.
 */
public interface EventSource {
    List<TelemetryEvent> snapshot();

    SessionMetadata metadata();
}
