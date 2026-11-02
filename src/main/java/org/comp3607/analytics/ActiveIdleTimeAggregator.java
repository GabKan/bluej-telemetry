package org.comp3607.analytics;

import java.util.List;
import java.util.Map;
import org.comp3607.model.TelemetryEvent;

/**
 * Calculates the session's active and idle time totals. Owner: Member C.
 * Pattern: Strategy
 */
public class ActiveIdleTimeAggregator implements MetricAggregator<Map<String, Long>> {

    public Map<String, Long> calculate(List<TelemetryEvent> events) {
        throw new UnsupportedOperationException("TODO Member C");
    }
}
