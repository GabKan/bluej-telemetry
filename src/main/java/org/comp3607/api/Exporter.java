package org.comp3607.api;

import java.io.IOException;
import java.nio.file.Path;
import org.comp3607.api.EventSource;

/**
 * Exports an event source to a destination path. Owner: Shared.
 */
public interface Exporter {
    void export(EventSource source, Path target) throws IOException;
}
