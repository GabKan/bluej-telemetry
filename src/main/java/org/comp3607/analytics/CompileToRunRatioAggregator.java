package org.comp3607.analytics;

import java.util.List;
import org.comp3607.model.TelemetryEvent;

/**
 * Calculates the ratio of compilations to executions. Owner: Member C.
 * Pattern: Strategy
 */
public class CompileToRunRatioAggregator implements MetricAggregator<Double> {

    public Double calculate(List<TelemetryEvent> events) {
        throw new UnsupportedOperationException("TODO Member C");
    }
}
