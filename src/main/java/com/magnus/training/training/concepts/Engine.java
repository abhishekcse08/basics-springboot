package com.magnus.training.training.concepts;
// Basic example
public class Engine {

    public void start(){
        System.out.println("Engine Starts");
    }
}

class Car {
    private Engine e = new Engine();

    public void drive(){
        e.start();
        System.out.println("Car Driving");
    }

}
