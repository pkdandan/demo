package com.sgl.demo.utils;

import com.sgl.demo.model.*;

import java.util.HashMap;
import java.util.Map;

public class Util {

    public static Map<String, String> languageMap = new HashMap<>();

    static{
        languageMap.put("English", "Cock-a-doodle-doo");
        languageMap.put("Danish", "kykyliky");
        languageMap.put("Dutch", "kukeleku");
        languageMap.put("Finnish", "kukko kiekuu");
        languageMap.put("French", "cocorico");
        languageMap.put("German", "kikeriki");
        languageMap.put("Greek", "kikiriki");
        languageMap.put("Hebrew", "coo- koo- ri-koo");
        languageMap.put("Hungarian", "kukuriku");
        languageMap.put("Italian", "chicchirichi");
        languageMap.put("Japanese", "ko- ke- kok- ko-o");
        languageMap.put("Portuguese", "cucurucu");
        languageMap.put("Russian", "kukareku");
        languageMap.put("Swedish", "kuckeliku");
        languageMap.put("Turkish", "kuk-kurri-kuuu");
        languageMap.put("Urdu", "kuklooku");
    }

    public static boolean predict(Animal animal, String type) {
        if ("fly".equalsIgnoreCase(type)) {
            return animal instanceof FlyAnimal;
        } else if ("walk".equalsIgnoreCase(type)) {
            return animal instanceof WalkAnimal;
        } else if ("swim".equalsIgnoreCase(type)) {
            return animal instanceof SwimAnimal;
        } else if ("sing".equalsIgnoreCase(type)) {
            return animal instanceof SingingAnimal;
        } else {
            return false;
        }
    }

    public static String getVoiceByLanguage(String language){
        return languageMap.get(language);
    }
}
