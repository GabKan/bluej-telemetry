package org.comp3607.model;

/**
 * Defines the event categories recorded by a telemetry session. Owner: Shared.
 */
public enum EventType {
    PROJECT_OPEN,
    PROJECT_CLOSE,
    EDITOR_OPEN,
    EDITOR_CLOSE,
    COMPILE_START,
    COMPILE_FINISH,
    EXECUTION,
    CLASS_CREATED,
    CLASS_DELETED,
    CLASS_MODIFIED
}
