
import java.util.*;
public class FizzBuzz2 {
    public static void main(String[] args) {
        // Take a number as user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        scanner.close();

        // Check if the number is a positive integer
        if (number > 0) {
            // Initialize counter
            int i = 0;
            // Loop from 0 to the number
            while (i <= number) {
                // Check for multiples of both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check for multiples of 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check for multiples of 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Print the number
                else {
                    System.out.println(i);
                }
                // Increment counter
                i++;
            }
        } else {
            System.out.println("Invalid input. Please enter a positive integer.");
        }
    }
}
