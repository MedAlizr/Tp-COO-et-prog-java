import java.util.Scanner;

public class ZooManagement {
   public int nbrCages = 20;
   public String zooName ="My Zoo";
    public static void main(String[] args){

        ZooManagement ze = new ZooManagement();
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        System.out.println("saisir nombre de cages");
        ze.nbrCages = s1.nextInt();
        System.out.println("saisir nom de votre zoo");
        ze.zooName = s2.next();

        System.out.println(ze.zooName+" comporte "+ze.nbrCages+" cages ");

    }
}