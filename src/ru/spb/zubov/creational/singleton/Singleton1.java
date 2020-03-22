package ru.spb.zubov.creational.singleton;

public class Singleton1 {

    private static Singleton1 singleton;

    public static synchronized Singleton1 getInstance() {
        if (singleton == null) {
            singleton = new Singleton1();
        }
        return singleton;
    }
}