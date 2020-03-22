package ru.spb.zubov.creational.factoryMethod;

public enum CoffeeType {

    ESPRESSO,
    AMERICANO,
    CAFFE_LATTE,
    CAPPUCCINO
}

class ItalianStyleAmericano extends Coffee {}
class ItalianStyleCappuccino extends Coffee {}
class ItalianStyleCaffeLatte extends Coffee {}
class ItalianStyleEspresso extends Coffee {}

class AmericanStyleAmericano extends Coffee {}
class AmericanStyleCappuccino extends Coffee {}
class AmericanStyleCaffeLatte extends Coffee {}
class AmericanStyleEspresso extends Coffee {}