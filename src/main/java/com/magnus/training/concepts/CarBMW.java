package com.magnus.training.concepts;

import org.springframework.stereotype.Component;

@Component
public class CarBMW {

    private final BMWEngine engine;

    public CarBMW(BMWEngine engine){
        this.engine = engine;
    }
    public void drive(){
        System.out.println("Inside Driving BMW Car");
        engine.start();
    }

}

@Component
class AudiCar{

    // Field Injection
   /* @Autowired*/
    private  BMWEngine engine;

    // Setter Injection
    /*@Autowired
    public void setEngine(BMWEngine engine) {
        this.engine = engine;
    }*/

    // constrctor based injection
    /*@Autowired
    public AudiCar(BMWEngine engine) {
        this.engine = engine;
    }*/

    public void drive(){
        System.out.println("Inside Driving audi");
        engine.start();
    }

}


@Component
class BMWEngine{


    public void start(){
        System.out.println("Engine Starts");
    }

}