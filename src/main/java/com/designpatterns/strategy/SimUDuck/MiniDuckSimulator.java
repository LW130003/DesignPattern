package com.designpatterns.strategy.SimUDuck;
/*
javac -cp src\main\java src\main\java\com\designpatterns\strategy\SimUDuck\MiniDuckSimulator.java
java -cp src\main\java com.designpatterns.strategy.SimUDuck.MiniDuckSimulator
*/
public class MiniDuckSimulator {
    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck();
        FlyBehavior cantFly = () -> System.out.println("I can't fly");
        QuackBehavior squeak = () -> System.out.println("Squeak");
        RubberDuck rubberDuckie = new RubberDuck(cantFly, squeak);
        DecoyDuck decoy = new DecoyDuck();

        Duck model = new ModelDuck();

        mallard.performQuack();
        rubberDuckie.performQuack();
        decoy.performQuack();

        mallard.performFly();
        rubberDuckie.performFly();
        decoy.performFly();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
