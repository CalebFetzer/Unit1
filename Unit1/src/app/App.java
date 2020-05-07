package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter a noun");
        String noun = input.nextLine();
       
        System.out.println("Please enter a name");
        String name = input.nextLine();

        System.out.println("Please enter a verb");
        String verb = input.nextLine();

        System.out.println("Please enter an adjective");
        String adjective = input.nextLine();

        System.out.println("Please enter a place");
        String place = input.nextLine();

        System.out.println("Please enter a food");
        String food = input.nextLine();

        System.out.println("Please enter an animal");
        String animal = input.nextLine();

        System.out.println("Please enter a number");
        String num = input.nextLine();

         System.out.println("James went to the store and was going to buy a " + noun);
         System.out.println("He then grabbed it, and proceeded to pay for his items. That's where he found a guy named " + name);
         System.out.println("He then decided to" + verb + " away");
         System.out.println("He got in his" + " car, and drove away.");
         System.out.println("He didn't know where to go, so he decided to drive to " + place);
         System.out.println("When he got there, he got hungry so he went and got food. He chose to order a " + food);
         System.out.println("He got his food, and left. When he got outside of " + place + ", he saw a "+ animal);
         System.out.println("At that point, he realized that he was super tired, and decided to drive home on Highway " + num);
         System.out.println("The end!");

        

    }
}
