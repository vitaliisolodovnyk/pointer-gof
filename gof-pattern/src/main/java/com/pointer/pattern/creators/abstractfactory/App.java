package com.pointer.pattern.creators.abstractfactory;


public class App {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = null;
        if ("cola".equals(args[0])) {
            abstractFactory = new CocaColaFactory();
        }
//        else if("fanta".equals(args[0])){
//            abstractFactory = new FantaFactory();
//        }

        Client client = new Client(abstractFactory);
        client.run();
    }
}
