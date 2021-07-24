package com.sgl.demo.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Dolphin implements Animal{

    @Autowired
    private Fish fish;

    @Override
    public String getName() {
        return "Dolphin";
    }

    public void swim(){
        fish.swim();
    }
}
