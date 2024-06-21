import java.util.Scanner;

public class MarksAverageProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store marks for 5 units
        double[] marks = new double[5];

        // Prompt the user to enter marks for each unit
        System.out.println("Enter marks for 5 units:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter mark for unit " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }

        // Calculate the average of marks
        double sum = 0;

        for (double mark : marks) {
            sum += mark;
        }

        double average = sum / 5.0; // Compute average

        // Display the average with two decimal places
        System.out.printf("Average marks: %.2f\n", average);

        scanner.close(); // Close the scanner to prevent resource leak
    }
}
    

