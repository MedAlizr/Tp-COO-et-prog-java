package tn.esprit.zooManagement.main;

import tn.esprit.zooManagement.entities.*;

public class ZooMain {


    public static void main(String[] args){

//
//        //animal class objects
//        Animal animal1= new Animal("canines","wolf",5,true);
//        Animal animal2= new Animal("felines","tiger",1,true);
//        Animal animal3= new Animal("felines","lion",1,true);
//        Animal animal4= new Animal("canines","wolf",5,true);
//
//        //instance of tn.esprit.zooManagement.entities.Zoo class
//        Zoo ze = new Zoo("myZoo","New York");
//
//        Zoo ze2 = new Zoo("myZoo2","New York");
//
//        //instance of tn.esprit.zooManagement.entities.Zoo used to store the comparison result
//        Zoo biggerZoo = new Zoo("","");
//
//
//
//        //displays zoo info
//        ze.displayZoo();
//
//        //instruction  8 and 9 du prosit 2  (commented for better visibility , uncomment if needed)
//            // System.out.println("Name : "+ze.name+ ", City : "+ze.city+", Cage number : "+ ze.nbrCages);
//            //System.out.println("Family : "+animal1.family+ ", Name : "+animal1.name+", age : "+ animal1.age+", Mammal : "+animal1.isMammal);
//            //System.out.println(animal2.toString());
//
//        //instruction 10  prosit 3
//        ze.addAnimal(animal1);
//        ze.addAnimal(animal2);
//
//        //this is added to verify if the unique animal condition is working (instruction 12)
//        ze.addAnimal(animal4);
//
//        //instruction 11 prosit 3
//            ze.displayAnimals();
//
//            //examples of "found" animals
//             System.out.println(ze.searchAnimal(animal1));
//             System.out.println(ze.searchAnimal(animal2));
//
//            //examples of "not found" animals
//             System.out.println(ze.searchAnimal(animal3));
//
//        //instruction 13 prosit 3
//        //example of animal removal
//             ze.removeAnimal(animal1);
//             //print statements to verify if the removal occured
//             System.out.println(ze.searchAnimal(animal1));
//             ze.displayAnimals();
//             //checks if the zoo is full
//             System.out.println(ze.isZooFull());
//
//            //calls the comparison method
//             biggerZoo = biggerZoo.comparerZoo(ze,ze2);
//             //displays the zoo with the larget animal count
//             System.out.print(biggerZoo.getName());
//
//
//
//



        //instruction 22 prosit 5
        Aquatic aquaticAnimal= new Aquatic("Chondrichthyes","shark",5,false,"sea") ;
        Terrestrial terrestrialAnimal = new Terrestrial("felines","cat",1,true,4);

        Dolphin dolphin1 = new Dolphin("delphinidae","dolphin",3,true,"sea",20);
        Penguin penguin1 = new Penguin("Spheniscidae","penguin",4,false,"Antarctica",200);


        //instruction 23 prosit 5
        System.out.println(aquaticAnimal.toString());
        System.out.println(terrestrialAnimal.toString());
        System.out.println(dolphin1.toString());
        System.out.println(penguin1.toString());


        aquaticAnimal.swim();
        dolphin1.swim();
        penguin1.swim();
    }
}