package com.pointer.pattern.creators.singleton;

public class Singleton {

    public final String name = "singleton";

    private volatile static Singleton singleton;

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }

    private Singleton() {
    }


}
