package tn.esprit.zooManagement.entities;

public class Zoo {
    private Animal [] animals;
    private String name;
    private String city;
    private final int nbrCages = 2;

    public Zoo( String name, String city) {
        animals = new Animal[nbrCages];
        setName(name);
        this.city = city;

    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        if(name !="" && name !=null){
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("Zoo name cant't be null");
        }

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public void displayZoo(){
        System.out.println("Name : "+name +"\nCity : "+city +"\nCage number : "+nbrCages);
    }


    //instruction 10 prosit 3
    public boolean addAnimal(Animal animal){
        //the return bool
        boolean added = false;
        //the counter
        int animalCounter = 0;
        boolean isZooFull = isZooFull();
        //makes sure the zoo cages dont excede the number and that the animal does not exist
        if(nbrCages <= 25 && searchAnimal(animal)== -1 && !isZooFull ){
            //makes sure the current case is empty else it passes to the next
            while (animalCounter < nbrCages && !added){
                if(animals[animalCounter] == null)
                {
                    animals[animalCounter]= animal;
                    animalCounter ++;
                    added = true;
                }
                else
                {
                    animalCounter ++;
                }
            }
        }
        System.out.println(added);
        System.out.println(animalCounter);
        //returns the bool value
        return added;
    }

    //instruction 11 prosit 3
    public void displayAnimals(){
        int animalCounter = 0;
        while(animalCounter < nbrCages && animals[animalCounter] != null){
            System.out.println(animals[animalCounter]);
            animalCounter ++;
        }
    }

    public int searchAnimal(Animal animal){
        int animalCounter = 0;
        int found = -1;
        while(animalCounter < nbrCages && found == -1 && animals[animalCounter] != null){
            if(animal.getName().equals(animals[animalCounter].getName())){
                found = animalCounter;
            }
            else{
                animalCounter ++;
            }

        }
        return found ;
    }


    public void removeAnimal(Animal animal){
        int animalIndex = searchAnimal(animal);
        if(animalIndex != -1){
            while(animals[animalIndex]!=null && animalIndex < nbrCages -1){
                animals[animalIndex] = animals[animalIndex + 1];
                animalIndex ++;
                if(animalIndex==nbrCages-1){
                    animals[animalIndex] = null;
                }
            }
            System.out.println("tn.esprit.zooManagement.entities.Animal removed successfully");
        }
        else
        {
            System.out.println("tn.esprit.zooManagement.entities.Animal doesn't exist");
        }
    }

    //instruction 15 prosit 3
    public boolean isZooFull(){
        int counter = 0 ;
        boolean isFull = false;

        while(animals[counter] != null && !isFull){
            if(counter < nbrCages-1) {
                counter++;
            }else {
                isFull = true;
            }
        }

        return isFull;
    }

    //instruction 16 prosit 3
    public Zoo comparerZoo(Zoo z1, Zoo z2){
        Zoo biggerZoo ;
        int animalCounter = 0;
        int animalCounter2 = 0;
//        if(z1.isZooFull()== z2.isZooFull()){
//            SySTEM.ou
//        }


        while((animalCounter < nbrCages -1) && (animalCounter2 < nbrCages -1) ){
            if(z1.animals[animalCounter] != null){
                animalCounter ++;
            }
            if (z2.animals[animalCounter2] != null) {
                animalCounter2 ++;
            }
        }

        if(animalCounter > animalCounter2){
            biggerZoo = z1;
        }else{
            biggerZoo = z2;
        }


        return biggerZoo;
    }




}
