package com.example.tp3.event;

import java.time.Instant;

public abstract class BaseEvent {
    private final String id;
    private final Instant timestamp = Instant.now();
    protected BaseEvent(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public Instant getTimestamp() {
        return timestamp;
    }
}