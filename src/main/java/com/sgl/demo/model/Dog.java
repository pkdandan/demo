package com.sgl.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Dog implements WalkAnimal, SingingAnimal{

    @Override
    public String getName() {
        return "Dog";
    }

    @Override
    public void sing() {
        System.out.println("Woof woof");
    }

    @Override
    public void walk() {
        System.out.println("I am walking");
    }
}
