package com.pointer.pattern.creators.singleton;

public class InitOnDemandSingleton {

    private static class InstanceHolder {
        private static final InitOnDemandSingleton INSTANCE = new InitOnDemandSingleton();
    }

    public static InitOnDemandSingleton getInstance() {
        return InstanceHolder.INSTANCE;
    }

    private InitOnDemandSingleton() {
    }
}