package org.comp3607.export;

import java.io.IOException;
import java.nio.file.Path;
import org.comp3607.api.EventSource;
import org.comp3607.api.Exporter;

/**
 * Schedules repeated exports at a fixed interval. Owner: Member B.
 */
public class PeriodicSaver {

    public void savePeriodically(EventSource source, Exporter exporter, Path target, long intervalMs) throws IOException {
        throw new UnsupportedOperationException("TODO Member B");
    }
}
