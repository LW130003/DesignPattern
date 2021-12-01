package com.designpatterns.strategy.SimUDuck;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("I can't Quack!");
    }
}
