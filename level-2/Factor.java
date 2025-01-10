import java.util.*;
public class Factor {
    public static void main(String[] args) {
        // Get the input value from the user
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Find and print the factors of the number
        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i < number; i++) {
            // Check if number is perfectly divisible by i
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
