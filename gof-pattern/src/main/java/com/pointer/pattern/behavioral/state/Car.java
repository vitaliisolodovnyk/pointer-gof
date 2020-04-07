package com.pointer.pattern.behavioral.state;

public class Car {

    private CarState state = new MotorStoppedState();
    protected int speed;
    protected boolean motorWorks;


    public void startMotor() {
        state.start(this);
    }

    public void stopMotor() {
        state.stop(this);
    }

    public void setSpeed(int speed) {
        state.speed(this, speed);
    }

    public void changeState(CarState s) {
        state = s;
    }

    void drive(int speed) {
        state.speed(this, speed);
        System.out.println("Speed: " + speed);
    }
}
