package ru.spb.zubov.creational.singleton;

public class Singleton2 {

    private static volatile Singleton2 singleton;

    public static Singleton2 getInstance() {
        Singleton2 localInstance = singleton;
        if (localInstance == null) {
            synchronized (Singleton2.class) {
                localInstance = singleton;
                if (localInstance == null) {
                    singleton = localInstance = new Singleton2();
                }
            }
        }
        return localInstance;
    }
}
