package com.pointer.pattern.structual.adapter;

public class App {

    public static void main(String[] args) {
        ToyDuck toyDuck = new PlasticToyDuck();

        Bird birdOriginal = new Sparrow();

        ToyDuck bird = new BirdToToyDuckAdapter(birdOriginal);

        makeVoice(toyDuck);
        makeVoice(bird);
    }

    private static void makeVoice(ToyDuck toy){
        toy.squeak();
    }
}
