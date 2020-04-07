package com.pointer.pattern.behavioral.templatemethod;

import java.io.*;

public abstract class AbstractRender {

    private File open(String path) {
        return new File(path);
    }

    private void close(InputStream stream) throws IOException {
        stream.close();
    }

    void read(InputStream is) {
        System.out.println("Default display");
    }

    final void render(String path) throws Exception {
        File file = open(path);
        FileInputStream is = new FileInputStream(file);
        read(is);
        close(is);
    }


}
