package com.pointer.pattern.creators.builder;

public class App {

    public static void main(String[] args) {
        Computer computer1 = new Computer
                .ComputerBuilder("HDD500", "RAM2333")
                .withBluetoothEnabled(false)
                .withGraphicsCardEnabled(true)
                .build();

        System.out.println(computer1);
    }
}
