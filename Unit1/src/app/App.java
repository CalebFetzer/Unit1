package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        Scanner input = new Scanner(System.in);

        dog1.name = "Bob";
        dog2.breed = "Black Lab";
        dog3.age = 2;

        System.out.println(dog1.name);
        System.out.println(dog2.breed);
        System.out.println(dog3.age);

    }
}
