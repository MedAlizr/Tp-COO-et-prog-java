public class Animal {
    String family ;
    String name;
    int age;
    boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String toString(){
        String info = "Family : "+family+ ", Name : "+name+", age : "+age+", Mammal : "+isMammal;

        return info;
    }
}
