package org.comp3607.bluej;

/**
 * Defines the adapter boundary for registering BlueJ event listeners. Owner: Member A.
 * Pattern: Adapter
 */
public interface BlueJAdapter {
    void registerEventListeners();

    void unregisterEventListeners();
}
