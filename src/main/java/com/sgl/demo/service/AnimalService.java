package com.sgl.demo.service;

import java.util.List;

public interface AnimalService {
    List<String> getAllAnimals();

    List<String> getAnimalsByType(String type);
}
