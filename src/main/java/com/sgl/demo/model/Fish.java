package com.sgl.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Fish implements SwimAnimal{

    @Override
    public String getName() {
        return "Fish";
    }

    @Override
    public void swim() {
        System.out.println("I am Swimming");
    }
    
    public void trait(){
        System.out.println("I am black fish");
    }
}
