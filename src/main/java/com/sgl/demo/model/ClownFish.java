package com.sgl.demo.model;

import org.springframework.stereotype.Component;

@Component
public class ClownFish extends Fish{
    @Override
    public String getName() {
        return "ClownFish";
    }

    @Override
    public void trait(){
        System.out.println("I am Small and Colorful");
    }

    public void special(){
        System.out.println("I make jokes");
    }
}
