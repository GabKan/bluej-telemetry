package org.comp3607.analytics;

import java.util.List;
import java.util.Map;
import org.comp3607.model.TelemetryEvent;

/**
 * Counts compilation errors by error type. Owner: Member C.
 * Pattern: Strategy
 */
public class ErrorFrequencyAggregator implements MetricAggregator<Map<String, Long>> {

    public Map<String, Long> calculate(List<TelemetryEvent> events) {
        throw new UnsupportedOperationException("TODO Member C");
    }
}
