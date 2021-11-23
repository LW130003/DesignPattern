package com.livardy.designpatterns.strategy.SimUDuck;

public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}