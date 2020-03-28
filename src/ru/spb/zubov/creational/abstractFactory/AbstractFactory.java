package ru.spb.zubov.creational.abstractFactory;

public class AbstractFactory {

    public static CarsFactory getFactory(CarType carType) {
        switch (carType) {
            case FORD:
                return new FordFactory();
            case TOYOTA:
                return new ToyotaFactory();
            default:
                throw new RuntimeException();
        }
    }
}
