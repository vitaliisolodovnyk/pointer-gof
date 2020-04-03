package com.pointer.pattern.structual.adapter;

public class BirdToToyDuckAdapter implements ToyDuck {

    private final Bird bird;

    public BirdToToyDuckAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void squeak() {
        bird.makeSound();
    }
}
