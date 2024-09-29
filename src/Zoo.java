public class Zoo {
    Animal [] animals;
    String name;
    String city;
    int nbrCages = 25;

    public Zoo( String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
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
        //makes sure the zoo cages dont excede the number and that the animal does not exist
        if(nbrCages <= 25 && searchAnimal(animal)== -1 ){
            //makes sure the current case is empty else it passes to the next
            while (animalCounter < nbrCages && added == false){
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
            if(animal.name == animals[animalCounter].name){
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
            while(animals[animalIndex]!=null){
                animals[animalIndex] = animals[animalIndex + 1];
                animalIndex ++;
            }
            System.out.println("Animal removed successfully");
        }
        else
        {
            System.out.println("Animal doesn't exist");
        }
    }



}
