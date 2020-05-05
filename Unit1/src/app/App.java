package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("How many continents are there?");
        String continents = input.nextLine();

        if (continents.equals("7")){
            System.out.println("Corrrect");
        }else{
            System.out.println("Incorrect");
        }
        System.out.println("How many hours are in a day?");
        String hrsDay = input.nextLine();

        if (hrsDay.equals("24")){
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect");
        }
        System.out.println("What is 1+1?");
        String correctNum = input.nextLine();
        if (correctNum.equals("2")){
            System.out.println("Correct");
        }else {
            System.out.println("Incorrect");
        }


        
        

    }
}
