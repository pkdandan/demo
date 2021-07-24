package com.sgl.demo.model;

public class Shark extends Fish{

    @Override
    public String getName() {
        return "Shark";
    }

    @Override
    public void trait(){
        System.out.println("I am Large and Grey");
    }

    public void special(){
        System.out.println("I eat other fish");
    }
}
