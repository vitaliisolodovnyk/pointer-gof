package com.pointer.pattern.behavioral.templatemethod;

import java.io.InputStream;

public class PdfRenderer extends AbstractRender {

    @Override
    void read(InputStream is) {
        System.out.println("This is PDF");
        super.read(is);
    }
}
