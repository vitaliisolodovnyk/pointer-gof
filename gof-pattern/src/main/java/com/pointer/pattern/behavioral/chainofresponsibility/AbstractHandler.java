package com.pointer.pattern.behavioral.chainofresponsibility;

public abstract class AbstractHandler {

    protected AbstractHandler handler;

    public AbstractHandler(AbstractHandler handler) {
        this.handler = handler;
    }

    public abstract int handleRequest(String request);
}
