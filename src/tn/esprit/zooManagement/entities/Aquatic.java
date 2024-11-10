package tn.esprit.zooManagement.entities;

public abstract class Aquatic extends Animal {

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
        Aquatic other = (Aquatic) obj;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        } else
            return (this.getName() == other.getName()) && (this.getAge() == other.getAge())
                    && (this.habitat == other.habitat);
    }
}
