package com.sgl.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Caterpillar implements Insect, WalkAnimal{

    @Override
    public String getName() {
        return "Caterpillar";
    }

    @Override
    public void walk() {
        System.out.println("I am Walking");
    }
}
