package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        Scanner input = new Scanner(System.in);

        dog1.name = "Bob";
        dog2.breed = "Black Lab";
        dog3.age = 2;

        person1.iq = 9;
        person2.shoeSize = 10;
        person3.height = "5'6";

        System.out.println(dog1.name);
        System.out.println(dog2.breed);
        System.out.println(dog3.age);
        System.out.println(person1.iq);
        System.out.println(person2.shoeSize);
        System.out.println(person3.height);

    }
}
