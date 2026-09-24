package com.magnus.training.concepts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Engines {

    public void start(){
        System.out.println("Engine Starts");
    }
}


@Component
class Cars {
    //private Engine e = new Engine();
    private Engines es;

    @Autowired
    public Cars(Engines es) {
        this.es = es;
    }

    public void drive(){
        es.start();
        System.out.println("Car Driving");
    }

}