package com.pointer.pattern.behavioral.state;

public class App {

    public static void main(String[] args) {


        Car car = new Car();

        car.startMotor();
        car.drive(100);
        car.stopMotor();
        car.drive(150);
    }
}
