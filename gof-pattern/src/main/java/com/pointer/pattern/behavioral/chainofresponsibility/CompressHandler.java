package com.pointer.pattern.behavioral.chainofresponsibility;

public class CompressHandler extends AbstractHandler {

    public CompressHandler(AbstractHandler handler) {
        super(handler);
    }

    @Override
    public int handleRequest(String request) {
        String s = request.toUpperCase();

        return this.handler.handleRequest(s);

    }
}
