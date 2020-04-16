package com.pointer.pattern.behavioral.state;

public class MotorWorksState implements CarState {

    @Override
    public void start(Car c) {
        throw new RuntimeException("Двигатель уже запущен!");

    }

    @Override
    public void stop(Car c) {
        c.motorWorks = false;
        c.changeState(new MotorStoppedState());
    }

    @Override
    public void speed(Car c, int speed) {
        if (speed >= 0) {
            c.speed = speed;
        } else {
            throw new RuntimeException("Значение скорости не может быть отрицательным!");
        }
    }
}
