package Workshops;

public class App {
    public static void main(String[] args) {


        System.out.println(Cat.latinName);
        System.out.println(Dog.latinName);


        Cat mugsy = new Cat();
        mugsy.name = "Mugsy";
        mugsy.color = "Brown, Black, and White";
        mugsy.age = 12;
        mugsy.isFluffy = true;


        Dog luna = new Dog();
        luna.name = "Luna Dog";
        luna.age = 2;
        luna.color = "All Black ";
        luna.breed = " German Shepard ";
        luna.isGoodgirl = true;

        mugsy.meow();
        luna.bark();









    }
}
