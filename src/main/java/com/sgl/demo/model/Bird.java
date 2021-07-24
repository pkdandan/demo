package com.sgl.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Bird implements WalkAnimal, FlyAnimal, SingingAnimal{

    @Override
    public String getName() {
        return "Bird";
    }

    public void walk(){
        System.out.println("I am Walking");
    }

    public void fly(){
        System.out.println("I am flying");
    }

    public void sing(){
        System.out.println("I am Singing");
    }

}
