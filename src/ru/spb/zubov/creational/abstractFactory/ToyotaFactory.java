package ru.spb.zubov.creational.abstractFactory;

public class ToyotaFactory implements CarsFactory {
    @Override
    public Sedan createSedan() {
        return new  ToyotaSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new ToyotaCoupe();
    }
}
