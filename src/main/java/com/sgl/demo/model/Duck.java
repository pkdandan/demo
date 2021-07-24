package com.sgl.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Duck implements WalkAnimal, SingingAnimal, SwimAnimal{
    @Override
    public String getName() {
        return "Duck";
    }

    @Override
    public void sing() {
        System.out.println("Quack quack");
    }

    @Override
    public void walk() {
        System.out.println("I am Walking");
    }

    @Override
    public void swim() {
        System.out.println("I am Swimming");
    }
}
