package com.pointer.pattern.behavioral.observable;

@FunctionalInterface
public interface Subscriber {

    void handle(double data);
}
