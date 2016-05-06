package com.clearfaun.playing.around;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by SpencerDepas on 5/5/16.
 */
public class AnimalsFromCambridge implements AnimalIterator {


    HashMap<Integer, Animal> animalRoster = new HashMap<Integer, Animal>();
    int hashKey = 0;


    public AnimalsFromCambridge(){



        addAnimal("Cat", "Catapi", 22);
        addAnimal("Dog", "Fly", 44);
        addAnimal("Dog", "Bob", 1888899);



    }

    public void addAnimal(String animalType, String name, int age){

        Animal animal = new Animal(animalType, name, age);
        animalRoster.put(hashKey, animal);
        hashKey++;

    }

    public HashMap<Integer, Animal>  getAnimals() {

        return animalRoster;
    }


    @Override
    public Iterator createIterator() {
        return animalRoster.values().iterator();
    }
}