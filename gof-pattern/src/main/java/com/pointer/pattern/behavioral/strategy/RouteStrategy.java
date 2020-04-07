package com.pointer.pattern.behavioral.strategy;

@FunctionalInterface
public interface RouteStrategy {

    String createRoute(int a, int b);
}
