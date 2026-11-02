package org.comp3607.analytics;

import java.util.List;
import org.comp3607.model.TelemetryEvent;

/**
 * Defines a strategy for calculating a metric from telemetry events. Owner: Member C.
 * Pattern: Strategy
 */
public interface MetricAggregator<T> {
    T calculate(List<TelemetryEvent> events);
}
