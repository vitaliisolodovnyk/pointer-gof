package com.pointer.pattern.abstractfactory;

public class CocaColaFactory extends AbstractFactory {


    Bottle createBottle() {
        return new CocaColaBottle();
    }

    Water createWater() {
        return new CocaColaWater();
    }
}
