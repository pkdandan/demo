package com.sgl.demo.service.impl;

import com.sgl.demo.model.Animal;
import com.sgl.demo.service.AnimalService;
import com.sgl.demo.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    List<Animal> animalList;

    @Override
    public List<String> getAllAnimals() {
        return animalList.stream().map(animal -> animal.getName()).collect(Collectors.toList());
    }

    @Override
    public List<String> getAnimalsByType(String type) {
        return animalList.stream().filter(animal -> Util.predict(animal, type))
                .map(animal -> animal.getName())
                .collect(Collectors.toList());
    }
}
