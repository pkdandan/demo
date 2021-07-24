package com.sgl.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Cat implements WalkAnimal, SingingAnimal{
    @Override
    public String getName() {
        return "Cat";
    }

    @Override
    public void sing() {
        System.out.println("Me ow");
    }

    @Override
    public void walk() {
        System.out.println("I am Walking");
    }
}
