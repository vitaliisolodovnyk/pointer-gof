package com.pointer.pattern.behavioral.chainofresponsibility;

public class AccessRequestHandler extends AbstractHandler{

    public AccessRequestHandler(AbstractHandler handler) {
        super(handler);
    }

    @Override
    public int handleRequest(String request) {
        if(request.length() >5){
            throw new IllegalArgumentException("request is too long !");
        }
        return this.handler.handleRequest(request);
    }
}
