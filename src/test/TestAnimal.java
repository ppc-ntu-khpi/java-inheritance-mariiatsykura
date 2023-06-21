package test;

import domain.Tiger;

public class TestAnimal {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Diego");
        System.out.println(tiger.toString());
        tiger.sleep();
        tiger.drink();
        tiger.talk();
        tiger.territoryProtection();
        tiger.run();
        tiger.climb();
        tiger.roar();
        tiger.hunt();
        tiger.eat();
    }
}

