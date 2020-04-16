package com.pointer.pattern.behavioral.templatemethod;

import java.io.InputStream;

public class RtfReaderer extends AbstractRender {
    @Override
    void read(InputStream is) {
        System.out.println("This is RTF");
        super.read(is);
    }
}
