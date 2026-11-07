package org.comp3607.analytics;

import java.util.List;

import org.comp3607.model.EventType;
import org.comp3607.model.TelemetryEvent;


//  Calculates the proportion of successful compilations.

public class CompileSuccessAggregator implements MetricAggregator<Double> {

    public Double calculate(List<TelemetryEvent> events) {
        int total = 0;
        int passed = 0;
     
            for (TelemetryEvent event : events) {
                if (event.getType() == EventType.COMPILE_FINISH) {
                    total = total + 1;
                    Object value = event.getData().get("success");
                    if (String.valueOf(value).equals("true")) {
                        passed = passed + 1;
                    }
                }
            }
     
            if (total == 0) {
                return 0.0;
            }
            double rate = (double) passed / total;
            return rate;
        }
    
}
