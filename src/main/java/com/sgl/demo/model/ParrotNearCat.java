package com.sgl.demo.model;

import org.springframework.beans.factory.annotation.Autowired;

public class ParrotNearCat implements SingingAnimal{

    @Autowired
    private Cat cat;

    @Override
    public String getName() {
        return "ParrotNearCat";
    }

    @Override
    public void sing() {
        cat.sing();
    }
}
