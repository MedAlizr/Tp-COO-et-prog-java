package tn.esprit.zooManagement.main;

import tn.esprit.zooManagement.Enumeration.Food;
import tn.esprit.zooManagement.entities.*;

public class ZooMain {

    public static void main(String[] args) {

        // animal class objects
        Animal animal1 = new Animal("canines", "wolf", 5, true);
        Animal animal2 = new Animal("felines", "tiger", 1, true);
        Animal animal3 = new Animal("felines", "lion", 1, true);
        Animal animal4 = new Animal("canines", "wolf", 5, true);

        // instance of tn.esprit.zooManagement.entities.Zoo class
        Zoo ze = new Zoo("myZoo", "New York");

        Zoo ze2 = new Zoo("myZoo2", "New York");

        // instance of tn.esprit.zooManagement.entities.Zoo used to store the comparison
        // result
        // Zoo biggerZoo = new Zoo("", "");

        // displays zoo info
        ze.displayZoo();

        try {
            ze.addAnimal(animal1);
        } catch (Exception e) {
            System.err.println(e);
        }
        try {
            ze.addAnimal(animal2);
        } catch (Exception e) {
            System.err.println(e);
        }
        try {
            ze.addAnimal(animal4);
        } catch (Exception e) {
            System.err.println(e);
        }

        // instruction 11 prosit 3
        ze.displayAnimals();

        // examples of "found" animals
        System.out.println(ze.searchAnimal(animal1));
        System.out.println(ze.searchAnimal(animal2));

        // examples of "not found" animals
        System.out.println(ze.searchAnimal(animal3));

        // instruction 13 prosit 3
        // example of animal removal
        ze.removeAnimal(animal1);
        // print statements to verify if the removal occured
        System.out.println(ze.searchAnimal(animal1));
        ze.displayAnimals();
        // checks if the zoo is full
        System.out.println(ze.isZooFull());

        // calls the comparison method
        // biggerZoo = biggerZoo.comparerZoo(ze, ze2);
        // displays the zoo with the larget animal count
        // System.out.print(biggerZoo.getName());

        Terrestrial terrestrialAnimal = new Terrestrial("felines", "cat", 1, true, 4);

        Dolphin dolphin1 = new Dolphin("delphinidae", "dolphin", 3, true, "sea", 20);
        Penguin penguin1 = new Penguin("Spheniscidae", "penguin", 4, false, "Antarctica", 200);

        // instruction 23 prosit 5

        System.out.println(terrestrialAnimal.toString());
        System.out.println(dolphin1.toString());
        System.out.println(penguin1.toString());

        dolphin1.swim();
        penguin1.swim();

        // instruction 26 prosit 6
        ze.addAquaticAnimal(dolphin1);
        ze.addAquaticAnimal(penguin1);

        // instruction 27 prosit 6
        int counter = 0;
        while (ze.AquaticAnimals[counter] != null) {
            ze.AquaticAnimals[counter].swim();
            counter++;
        }

        terrestrialAnimal.eatPlantAndMeet(Food.MEAT);
        penguin1.eatMeat(Food.MEAT);

    }
}