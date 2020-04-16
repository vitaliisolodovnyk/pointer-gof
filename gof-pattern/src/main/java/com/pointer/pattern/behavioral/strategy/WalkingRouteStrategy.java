package com.pointer.pattern.behavioral.strategy;

public class WalkingRouteStrategy implements RouteStrategy {

    @Override
    public String createRoute(int a, int b) {
        return "Route is created with coordinates for walking: [" + a + "," + b + "]";
    }
}
