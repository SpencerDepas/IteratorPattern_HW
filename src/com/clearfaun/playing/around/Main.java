package com.clearfaun.playing.around;

import java.util.Iterator;

public class Main {


    public static void main(String[] args) {
	// write your code here

        AnimalsFromBrooklyn brooklynAnimals = new AnimalsFromBrooklyn();
        //here are my animals from brooklyn
        //I like to keep them in an arraylist
        //I use an interator interface so that they can be
        //iterated through with other animals that are kept in other places

        AnimalsFromCambridge cambridgeAnimals = new AnimalsFromCambridge();
        //When I am in Cambridge arrayLists are short on supply so
        //we keep our animals in hashmaps


        AnimalCharmer zekeTheAnimalCharmerBadAssDude = new AnimalCharmer(brooklynAnimals, cambridgeAnimals);
        //zekeTheAnimalCharmerBadAssDude is able to print a list
        //of animals even though they are put in difrent places

        zekeTheAnimalCharmerBadAssDude.showTheAnimals();
        //show the animals has a pint method that can print an arraylist and a hashtable!


        //output
        //

    }


}
