package com.sgl.demo.model;

import com.sgl.demo.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class Rooster implements Animal{

    @Autowired
    private Chicken chicken;

    @Override
    public String getName() {
        return "Rooster";
    }

    public void sing() {
        String localLanguage = Locale.getDefault().getDisplayLanguage();
        String voice = Util.getVoiceByLanguage(localLanguage);
        System.out.println(voice);
    }

    public void walk() {
        chicken.walk();
    }
}
