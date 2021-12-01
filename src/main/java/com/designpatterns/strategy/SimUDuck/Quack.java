package com.designpatterns.strategy.SimUDuck;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack!");
    }
}
