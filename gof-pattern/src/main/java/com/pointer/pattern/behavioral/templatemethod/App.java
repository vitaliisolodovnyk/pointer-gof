package com.pointer.pattern.behavioral.templatemethod;

public class App {

    public static void main(String[] args) throws Exception {

        AbstractRender render1 = new PdfRenderer();
        AbstractRender render2 = new RtfReaderer();

        render1.render("file1");
        render2.render("file2");
    }
}
