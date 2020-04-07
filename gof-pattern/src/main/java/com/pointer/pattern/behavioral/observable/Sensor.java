package com.pointer.pattern.behavioral.observable;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Sensor {

    protected Collection<Subscriber> components = new ArrayList<>();

    void subscribe(Subscriber component) {
        this.components.add(component);
    }

    void unsubscribe(Subscriber component){
        this.components.remove(component);
    }
}
