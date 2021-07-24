package com.sgl.demo.model;

import org.springframework.stereotype.Component;

@Component
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
