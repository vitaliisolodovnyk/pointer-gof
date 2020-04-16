package com.pointer.pattern.structual.decorator;

public class App {

    public static void main(String[] args) {

        ChristmasTree christmasTree1 = new Stars(new BubbleLights(new ChristmasTreeImpl()));

        ChristmasTree christmasTree2 = new BubbleLights(new Stars((new ChristmasTreeImpl())));

        System.out.println(christmasTree1.decorate());
        System.out.println(christmasTree2.decorate());

    }
}
