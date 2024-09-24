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
}
