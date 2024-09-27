package com.kridentia.documentautocapture;

public class EventHandler {
    private final MyEventCallback callback;

    public EventHandler(MyEventCallback callback) {
        this.callback = callback;
    }

    public void triggerEvent() {
        // Simulate an event
        if (callback != null) {
            callback.onEventTriggered("Event has been triggered!");
        }
    }
}
