package org.comp3607.analytics;

import java.util.List;
import org.comp3607.model.TelemetryEvent;

/**
 * Calculates the proportion of successful compilations. Owner: Member C.
 * Pattern: Strategy
 */
public class CompileSuccessAggregator implements MetricAggregator<Double> {

    public Double calculate(List<TelemetryEvent> events) {
        throw new UnsupportedOperationException("TODO Member C");
    }
}
