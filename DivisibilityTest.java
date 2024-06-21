import java.util.Scanner;

public class DivisibilityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check divisibility from 1 to 9
        for (int i = 1; i <= 9; i++) {
            if (number % i == 0) {
                System.out.println("The number is divisible by " + i);
            }
        }

        // Check divisibility by 10 separately (ends with 0)
        if (number % 10 == 0) {
            System.out.println("The number is divisible by 10 because it ends with a 0");
        }

        scanner.close();
    }
}
