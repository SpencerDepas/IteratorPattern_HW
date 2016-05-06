package com.clearfaun.playing.around;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by SpencerDepas on 5/5/16.
 */
public class AnimalsFromBrooklyn implements AnimalIterator {


    ArrayList<Animal> animalRoster;

    public AnimalsFromBrooklyn(){

        animalRoster = new ArrayList <Animal>();

        addAnimal("Dog", "yoshi", 342);
        addAnimal("Cat", "Genie", 44);
        addAnimal("Dog", "Tillie", 198);



    }

    public void addAnimal(String animalType, String name, int age){

        Animal animal = new Animal(animalType, name, age);
        animalRoster.add(animal);

    }

    public ArrayList<Animal> getAnimals() {

        return animalRoster;
    }


    @Override
    public Iterator createIterator() {
        return animalRoster.iterator();
    }
}
