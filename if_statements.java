// Importing the Scanner class for taking input
import java.util.Scanner;
// declaration of public class
public class if_statements{
    public static void main(String[] args) {

        // Creating Scanner object (like umi) to take input from user
        Scanner umi = new Scanner(System.in);

        // Asking user to enter their age
        System.out.print("Enter your age: ");
        // Reading age input
        int age = umi.nextInt();

        // Checking the user is an adult
        if (age >= 18)
            System.out.println("You are an adult, according to this code");
        // Closing the Scanner
        umi.close();
    }
}






