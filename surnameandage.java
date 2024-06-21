import java.util.Scanner;
public class surnameandage{
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their surname
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        // Prompt the user to enter their current age
        System.out.print("Enter your current age: ");
        int age = scanner.nextInt();

        // Calculate the number of characters in the surname
        int surnameLength = surname.length();

        // Determine if age is even or odd
        String ageType = (age % 2 == 0) ? "even" : "odd";

        // Print the results
        System.out.println("Number of characters in your surname: " + surnameLength);
        System.out.println("Your age (" + age + ") is " + ageType + ".");
        
        scanner.close(); // Close the scanner to prevent resource leak
    }
}

