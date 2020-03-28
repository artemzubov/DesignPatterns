package ru.spb.zubov.creational.abstractFactory;

public class Main {

    public static void main(String[] args) {
        CarsFactory factory = AbstractFactory.getFactory(CarType.TOYOTA);
        factory.createSedan();
    }
}
