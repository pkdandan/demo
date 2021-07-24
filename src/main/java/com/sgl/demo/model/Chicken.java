package com.sgl.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Chicken implements WalkAnimal, SingingAnimal{

    @Override
    public String getName() {
        return "Chicken";
    }

    @Override
    public void sing() {
        System.out.println("Cluck cluck");
    }

    @Override
    public void walk() {
        System.out.println("I am Walking");
    }
}
