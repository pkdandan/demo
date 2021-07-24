package com.sgl.demo.model;

import com.sgl.demo.utils.Util;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class Solution {

    public static void main(String[] args) {
        Bird bird = new Bird();

        bird.walk();
        bird.fly();
        bird.sing();

        List<Animal> animalList = Arrays.asList(new Fish(), new Bird(), new Duck(),
                new Dog(), new Cat(), new Chicken(), new Dolphin(), new Shark(),
                new ClownFish(), new ButterFly(), new Caterpillar());

        AtomicInteger walkAnimalCount = new AtomicInteger();
        AtomicInteger flyAnimalCount = new AtomicInteger();
        AtomicInteger swimAnimalCount = new AtomicInteger();
        AtomicInteger singAnimalCount = new AtomicInteger();

        Consumer<Animal> animalConsumer = animal -> {
            if (animal instanceof WalkAnimal) walkAnimalCount.getAndIncrement();
            if (animal instanceof FlyAnimal) flyAnimalCount.getAndIncrement();
            if (animal instanceof SwimAnimal) swimAnimalCount.getAndIncrement();
            if (animal instanceof SingingAnimal) singAnimalCount.getAndIncrement();
        };

        animalList.forEach(animalConsumer);
        System.out.println("no of walk animals:" + walkAnimalCount);
        System.out.println("no of fly animals:" + flyAnimalCount);
        System.out.println("no of swim animals:" + swimAnimalCount);
        System.out.println("no of sing animals:" + singAnimalCount);

        Rooster rooster = new Rooster();
        rooster.sing();
    }
}
