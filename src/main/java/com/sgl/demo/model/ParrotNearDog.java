package com.sgl.demo.model;

import org.springframework.beans.factory.annotation.Autowired;

public class ParrotNearDog implements SingingAnimal{

    @Autowired
    private Dog dog;

    @Override
    public String getName() {
        return "ParrotNearDog";
    }

    @Override
    public void sing() {
        dog.sing();
    }
}
