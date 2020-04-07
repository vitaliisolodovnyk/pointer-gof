package com.pointer.pattern.behavioral.strategy;

public class Navigator {

    private RouteStrategy strategy = new WalkingRouteStrategy();


    void buildRoute(int a, int b) {
        System.out.println("/*********************/");
        String route = strategy.createRoute(a, b);
        System.out.println(route);
        System.out.println("/*********************/");
    }

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }
}
