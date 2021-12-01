package com.designpatterns.strategy.SimUDuck;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
