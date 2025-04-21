package Workshops;

public class Dog {
    static String latinName = "Canis lupus familiaris";
    String name;
    String breed;
    String color;
    int age;
    boolean isGoodgirl;

    public void bark() {
        System.out.println(name + "Says: Woof! " + color + "Breed:" + breed );
    }
}
