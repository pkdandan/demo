package com.sgl.demo.model;

import org.springframework.beans.factory.annotation.Autowired;

public class ParrotNearRooster implements SingingAnimal{

    @Autowired
    private Rooster rooster;

    @Override
    public String getName() {
        return "ParrotNearRooster";
    }

    @Override
    public void sing() {
        rooster.sing();
    }
}
