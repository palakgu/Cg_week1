import java.util.*;
public class Multiple {
    public static void main(String[] args) {
        // Get input value for a variable named number
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        scanner.close();

        // Run a for loop backward: from i = 100 to i = 1
        for (int i = 100; i >= 1; i--) {
            // Inside the loop, check if i perfectly divide the number
            if (number != 0 && i % number == 0) {
                // If true, print the number and continue the loop
                System.out.println(i);
            }
        }
    }
}
