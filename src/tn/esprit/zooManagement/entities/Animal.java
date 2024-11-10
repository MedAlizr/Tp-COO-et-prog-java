package tn.esprit.zooManagement.entities;

import tn.esprit.zooManagement.Exceptions.InvalidAgeException;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        try {
            setAge(age);
        } catch (Exception e) {
            System.err.println(e);
        }

        this.isMammal = isMammal;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age > 0) {
            this.age = age;
        } else {
            throw new InvalidAgeException();
        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    @Override
    public String toString() {
        String info = "Family : " + family + ", Name : " + name + ", age : " + age + ", Mammal : " + isMammal;

        return info;
    }
}
