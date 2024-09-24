public class ZooMain {


    public static void main(String[] args){


        //animal class objects
        Animal animal1= new Animal("canines","wolf",5,true);
        Animal animal2= new Animal("felines","tiger",1,true);

        //instance of Zoo class
        Zoo ze = new Zoo("myZoo","New York",25);

        //displays zoo info
        ze.displayZoo();

        //instruction  8 and 9 du prosit 2
        System.out.println("Name : "+ze.name+ ", City : "+ze.city+", Cage number : "+ ze.nbrCages);
        System.out.println("Family : "+animal1.family+ ", Name : "+animal1.name+", age : "+ animal1.age+", Mammal : "+animal1.isMammal);

        System.out.println(animal2.toString());

    }
}