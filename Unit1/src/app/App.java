package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("What's the count?");
        int j = input.nextInt();
        for (int i = 1; i <= j; i = i + 1) {
            System.out.println(i);
        }

    }
}
