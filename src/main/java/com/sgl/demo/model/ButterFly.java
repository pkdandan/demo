package com.sgl.demo.model;

public class ButterFly implements Insect, FlyAnimal{

    @Override
    public String getName() {
        return "ButterFly";
    }

    @Override
    public void fly() {
        System.out.println("I am Flying");
    }
}
