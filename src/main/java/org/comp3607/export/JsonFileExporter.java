package org.comp3607.export;

import java.io.IOException;
import java.nio.file.Path;
import org.comp3607.api.EventSource;
import org.comp3607.api.Exporter;

/**
 * Exports an event source as a JSON file. Owner: Member B.
 * Pattern: Strategy
 */
public class JsonFileExporter implements Exporter {

    public void export(EventSource source, Path target) throws IOException {
        throw new UnsupportedOperationException("TODO Member B");
    }
}
