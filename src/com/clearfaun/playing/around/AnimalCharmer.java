package com.clearfaun.playing.around;

import java.util.Iterator;

/**
 * Created by SpencerDepas on 5/5/16.
 */
public class AnimalCharmer {

    private AnimalIterator brooklynAnimals;
    private AnimalIterator cambridgeAnimals;

    public AnimalCharmer(AnimalIterator brooklynAnimals, AnimalIterator cambridgeAnimals){

        this.brooklynAnimals = brooklynAnimals;
        this.cambridgeAnimals = cambridgeAnimals;
    }

    public void showTheAnimals(){


        Iterator brooklynAnimalsIterator = brooklynAnimals.createIterator();
        Iterator cambridgeAnimalsIterator = cambridgeAnimals.createIterator();

        System.out.println("Animals from Brooklyn\n");
        printTheSongs(brooklynAnimalsIterator);

        System.out.println("Animals from Cambridge\n");
        printTheSongs(cambridgeAnimalsIterator);


    }

    private void printTheSongs(Iterator iterator){

        while(iterator.hasNext()){

            Animal animal = (Animal) iterator.next();

            System.out.println(animal.getName());
            System.out.println(animal.getType());
            System.out.println(animal.getAge() + "\n");


        }

    }
}
