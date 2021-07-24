package com.sgl.demo.controller;

import com.sgl.demo.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalController {

    @Autowired
    AnimalService animalService;

    @GetMapping(path = "getAllAnimals")
    private List<String> getAllAnimals() {
        return animalService.getAllAnimals();
    }

    @GetMapping(path = "/{type}")
    private List<String> getAnimalsByType(@PathVariable("type") String type) {
        return animalService.getAnimalsByType(type);
    }
}
