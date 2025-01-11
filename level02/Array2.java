import java.util.*;
public class Array2 {
    public static void main(String[] args) {
        // Take the input for a number
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        scanner.close();

        // Find the count of digits in the number
        int count = 0;
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        // Find the digits in the number and save them in an array
        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Find the frequency of each digit in the number
        int[] frequency = new int[10];
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Display the frequency of each digit in the number
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}