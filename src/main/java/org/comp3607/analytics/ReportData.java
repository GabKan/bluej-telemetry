package org.comp3607.analytics;

import java.util.List;
import java.util.Map;

/**
 * Holds calculated session analytics for report generation. Owner: Member C.
 */
public record ReportData(
        double compileSuccessRate,
        Map<String, Long> errorFrequency,
        long activeTimeMs,
        long idleTimeMs,
        double compileToRunRatio,
        List<String> classTimeline) {}
