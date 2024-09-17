import java.util.Scanner;

public class ZooManagement {

    //defines cage number attribute
   public int nbrCages = 20;

   //defines zoo name attributes
   public String zooName ="My Zoo";
    public static void main(String[] args){

        //create instance of class ZooManagement
        ZooManagement ze = new ZooManagement();

        //defines 2 scanner variables
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        //prints request statement
        System.out.println("saisir nombre de cages");

        //sets the cage number attribute of the ZooManagement instance as the input value
        ze.nbrCages = s1.nextInt();

        //prints request statement
        System.out.println("saisir nom de votre zoo");

        //sets the name attribute of the ZooManagement instance as the input value
        ze.zooName = s2.next();

        //prints final statement
        System.out.println(ze.zooName+" comporte "+ze.nbrCages+" cages ");

    }
}