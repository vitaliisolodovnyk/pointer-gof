package com.pointer.pattern.behavioral.chainofresponsibility;

public class App {

    public static void main(String[] args) {
        String request = "aaaaaa";


        RandomGenerator randomGenerator = new RandomGenerator();

        int response = new AccessRequestHandler(new CompressHandler(randomGenerator)).handleRequest(request);
        System.out.println(response);
    }

}
