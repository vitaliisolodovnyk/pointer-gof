package com.pointer.pattern.behavioral.state;

public class MotorStoppedState implements CarState {

    @Override
    public void start(Car c) {
        c.motorWorks = true;
        c.changeState(new MotorWorksState());
    }

    @Override
    public void stop(Car c) {
        throw new RuntimeException("Motor is started !");
    }

    @Override
    public void speed(Car c, int speed) {
        throw new RuntimeException("Нельзя изменить скорость, когда двигатель остановлен!");
    }
}
