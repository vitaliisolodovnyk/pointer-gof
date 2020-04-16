package com.pointer.pattern.structual.decorator;

public class Stars extends TreeDecorator {

    public Stars(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return "***" + super.decorate() + "***";
    }
}
