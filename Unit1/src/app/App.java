package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter a number");
        int num1 = input.nextInt();

        System.out.println("Please enter a function");
        String func1 = input.nextLine();

        System.out.println("Please enter a number");
        int num2 = input.nextInt();
        

        System.out.println(num1 + func1 + num2);

 //I cannot figure out how to add a function.


        

    }
}
