package com.pointer.pattern.behavioral.observable;

public class App {

    public static void main(String[] args) throws InterruptedException {

        Subscriber subscriberSms = t -> System.out.println("Send Temperature level by phone, t=" + t);

        Sensor temperatureSensor = new TemperatureSensor(140.0);

        temperatureSensor.subscribe(t -> System.out.println("Send Temperature level by email, t=" + t));
        temperatureSensor.subscribe(t -> System.out.println("Enable second coolant, t=" + t));
        temperatureSensor.subscribe(subscriberSms);


        Thread.sleep(10000);
        temperatureSensor.unsubscribe(subscriberSms);
    }
}
