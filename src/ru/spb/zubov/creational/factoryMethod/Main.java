package ru.spb.zubov.creational.factoryMethod;

//https://javarush.ru/groups/posts/2372--patternih-proektirovanija-factorymethod
public class Main {

    public static void main(String[] args) {
        CoffeeShop italianCoffeeShop = new ItalianCoffeeShop();
        italianCoffeeShop.orderCoffee(CoffeeType.CAFFE_LATTE);

        CoffeeShop americanCoffeeShop = new AmericanCoffeeShop();
        americanCoffeeShop.orderCoffee(CoffeeType.CAFFE_LATTE);
    }
}
