import java.util.*;
public class Power {
    public static void main(String[] args) {
        // Get integer input for number and power
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        // Initialize result variable to 1
        int result = 1;

        // Run a for loop from i = 1 to i <= power
        for (int i = 1; i <= power; i++) {
            // Multiply the result with the number and assign the value to the result
            result *= number;
        }

        // Print the result
        System.out.println("The result is: " + result);
    }
}
