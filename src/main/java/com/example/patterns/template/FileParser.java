package com.example.patterns.template;

public abstract class FileParser {
    private void start() {
        System.out.println("Starting...");
    }

    protected abstract void decode();

    private void show() {
        System.out.println("Showing...");
    }

    public final void parse() {
        start();
        decode();
        show();
    }
}
