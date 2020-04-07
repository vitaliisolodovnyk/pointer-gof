package com.pointer.pattern.behavioral.strategy;

public class App {


    public static void main(String[] args) {

        Navigator navigator = new Navigator();
        navigator.setStrategy(new PublicTransportRouteStrategy());

        navigator.buildRoute(10, 30);

        navigator.setStrategy(new WalkingRouteStrategy());
        navigator.buildRoute(10, 35);

        navigator.setStrategy((a, b) -> "Route is created with coordinates for driving car: [" + a + "," + b + "]");
        navigator.buildRoute(20, 70);

        Navigator n = new Navigator();

        n.buildRoute(1, 4);
    }
}
