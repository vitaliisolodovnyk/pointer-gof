package com.pointer.pattern.creators.abstractfactory;

public class CocaColaFactory extends AbstractFactory {


    Bottle createBottle() {
        return new CocaColaBottle();
    }

    Water createWater() {
        return new CocaColaWater();
    }
}
