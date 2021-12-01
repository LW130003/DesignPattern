package com.designpatterns.observer.simple;
/*
javac -cp src\main\java src\main\java\com\designpatterns\observer\simple\Example.java
java -cp src\main\java com.designpatterns.observer.simple.Example
*/

public class Example {
    public static void main(String[] args) {
        SimpleSubject simpleSubject = new SimpleSubject();
        SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);

        simpleSubject.setValue(80);
        simpleSubject.removeObserver(simpleObserver);
    }
}
