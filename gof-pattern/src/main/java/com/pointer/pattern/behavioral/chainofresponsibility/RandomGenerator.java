package com.pointer.pattern.behavioral.chainofresponsibility;

import java.util.Random;

public class RandomGenerator extends AbstractHandler {

    public RandomGenerator() {
        super(null);
    }


    @Override
    public int handleRequest(String request) {
        System.out.println("Request: " + request);

        return generateInt();
    }

    private int generateInt() {
        return new Random().nextInt();
    }
}
