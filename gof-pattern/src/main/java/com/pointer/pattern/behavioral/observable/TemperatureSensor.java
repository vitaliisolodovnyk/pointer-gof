package com.pointer.pattern.behavioral.observable;


import static java.util.concurrent.ThreadLocalRandom.current;

public class TemperatureSensor extends Sensor {

    private final double temperatureThreshold = 105.0;
    private double temperatureLevel;

    public TemperatureSensor(double temperatureLevel) {
        this.temperatureLevel = temperatureLevel;
        new Thread(this::measure).start();
    }

    private void measure() {
        while (true) {
            try {
                Thread.sleep(1000);
                changeTemperature(current().nextDouble(70, temperatureThreshold + 50.0));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void changeTemperature(double t) {
        temperatureLevel = t;
        notifySubscribers();
    }

    public void increaseTemperature() {
        temperatureLevel += 1;
        notifySubscribers();
    }

    private void notifySubscribers() {
        if (temperatureLevel >= temperatureThreshold) {
            this.components.parallelStream().forEach(component -> component.handle(temperatureLevel));
        }
    }

}
