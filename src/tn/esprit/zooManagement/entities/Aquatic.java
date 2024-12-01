package tn.esprit.zooManagement.entities;

import tn.esprit.zooManagement.Enumeration.Food;
import tn.esprit.zooManagement.Interfaces.Carnivore;

public abstract class Aquatic extends Animal implements Carnivore<Food> {

    protected String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + ", Habitat :" + habitat;
    }

    public abstract void swim();

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Aquatic other = (Aquatic) obj;
        return (this.getName() == other.getName()) && (this.getAge() == other.getAge())
                    && (this.habitat == other.habitat);
    }

    @Override
    public void eatMeat(Food meat) {
        System.out.println(this.getName() + " is eating " + meat.toString().toLowerCase() + ".");
    }
}
