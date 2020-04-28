package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

            Scanner input = new Scanner(System.in);

            System.out.println("Please enter your first name.");
            String name = input.nextLine();
            System.out.println("Please enter your last name");
            String lastName = input.nextLine();
            System.out.println("Please enter your age");
            String yourAge = input.nextLine();
            System.out.println("Please enter your grade");
            String yourGrade = input.nextLine();
            System.out.println("Please enter your favorite color");
            String favoriteColor = input.nextLine();

            System.out.println("Hello," + name + " " + lastName);
            System.out.println("You are " + yourAge + " years old");
            System.out.println("You are in " + yourGrade + "th grade");
            System.out.println("Your favorite color is" + favoriteColor);

            }
        }
    


