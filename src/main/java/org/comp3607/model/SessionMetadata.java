package org.comp3607.model;

/**
 * Describes the identity and time bounds of a telemetry session. Owner: Shared.
 */
public record SessionMetadata(String sessionId, String studentId, long startMs, long endMs) {}
