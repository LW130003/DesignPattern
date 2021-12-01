package com.designpatterns.strategy.SimUDuck;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    public void display() {
        System.out.println("This is the Decoy Duck.");
    }
}
