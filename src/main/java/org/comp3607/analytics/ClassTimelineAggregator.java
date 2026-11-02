package org.comp3607.analytics;

import java.util.List;
import org.comp3607.model.TelemetryEvent;

/**
 * Creates a timeline of class lifecycle events. Owner: Member C.
 * Pattern: Strategy
 */
public class ClassTimelineAggregator implements MetricAggregator<List<String>> {

    public List<String> calculate(List<TelemetryEvent> events) {
        throw new UnsupportedOperationException("TODO Member C");
    }
}
