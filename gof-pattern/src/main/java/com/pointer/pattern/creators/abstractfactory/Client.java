package com.pointer.pattern.creators.abstractfactory;

public class Client {

    private Water water;
    private Bottle bottle;

    public Client(AbstractFactory factory) {
        this.water = factory.createWater();
        this.bottle = factory.createBottle();
    }

    void run(){
        System.out.println(bottle.fill(water));
    }
}
