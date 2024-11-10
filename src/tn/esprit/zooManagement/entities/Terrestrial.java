package tn.esprit.zooManagement.entities;

import tn.esprit.zooManagement.Enumeration.Food;
import tn.esprit.zooManagement.Interfaces.Omnivore;

public class Terrestrial extends Animal implements Omnivore<Food> {
    protected int nbrLegs;

    public Terrestrial(String family, String name, int age, Boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", leg number :" + nbrLegs;
    }

    @Override
    public void eatPlantAndMeet(Food both) {
        System.out.println(this.getName() + " is eating " + both.toString().toLowerCase() + ".");

    }
}
