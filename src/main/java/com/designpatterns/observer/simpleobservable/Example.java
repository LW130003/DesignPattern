package com.designpatterns.observer.simpleobservable;
/*
javac -cp src\main\java src\main\java\com\designpatterns\observer\simpleobservable\Example.java
java -cp src\main\java com.designpatterns.observer.simpleobservable.Example
*/
public class Example {
    public static void main(String[] args) {
        SimpleSubject simpleSubject = new SimpleSubject();
        SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);
        simpleSubject.setValue(80);
    }
}
