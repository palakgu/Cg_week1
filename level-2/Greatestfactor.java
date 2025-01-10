

import java.util.*;
public class Greatestfactor {
    public static void main(String[] args) {
        // Get an integer input and assign it to the number variable
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Define a greatestFactor variable and assign it to 1
        int greatestFactor = 1;

        // Create a for loop that runs from last but one till 1
        for (int i = number - 1; i >= 1; i--) {
            // Check if the number is perfectly divisible by i
            if (number % i == 0) {
                // Assign i to greatestFactor variable and break the loop
                greatestFactor = i;
                break;
            }
        }

        // Display the greatestFactor variable outside the loop
        System.out.println("The greatest factor of " + number + " is " + greatestFactor);
    }
}
