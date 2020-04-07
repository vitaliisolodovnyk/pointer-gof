package com.pointer.pattern.behavioral.state;

public interface CarState {

    void start(Car c);
    void stop(Car c);
    void speed(Car c, int speed);
}
