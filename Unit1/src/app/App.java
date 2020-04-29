package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

            Scanner input = new Scanner(System.in);

            System.out.println("Please enter your password.");
            String passWord = input.nextLine();

            if (passWord.equals("183726073")){
                System.out.println("Access granted");
            }else{
                System.out.println("Access denied");
            }
            
            



            }
        }
    


