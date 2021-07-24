package com.sgl.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rooster implements Animal{

    @Autowired
    private Chicken chicken;

    @Override
    public String getName() {
        return "Rooster";
    }

    public void sing() {
        System.out.println("Cock-a-doodle-doo");
    }

    public void walk() {
        chicken.walk();
    }
}
