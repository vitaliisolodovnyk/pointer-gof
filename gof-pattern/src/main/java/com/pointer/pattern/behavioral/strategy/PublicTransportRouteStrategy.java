package com.pointer.pattern.behavioral.strategy;

public class PublicTransportRouteStrategy implements RouteStrategy {

    @Override
    public String createRoute(int a, int b) {
        return "Route is created with coordinates for public transport: [" + a + "," + b + "]";
    }
}
