package com.example.tp3.command;

public abstract class BaseCommand {
    private final String id;
    protected BaseCommand(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
}