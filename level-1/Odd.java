

import java.util.*;

class Odd {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        // Check if the number is a natural number (greater than or equal to 1)
        if (number < 1) {
            System.out.println("Please enter a natural number (greater than or equal to 1)");
            return;
        }

        // Iterate from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            // Check if the current number is even or odd
            if (i % 2 == 0) {
                System.out.println(i + " is an even number");
            } else {
                System.out.println(i + " is an odd number");
            }
        }
    }
}
