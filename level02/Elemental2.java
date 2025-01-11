
import java.util.Scanner;
public class Elemental2 {
    public static void main(String[] args) {
        // Create a number variable and Take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Define an array to store the digits
        int[] digits = new int[10];
        int maxDigit = 10;
        int index = 0;

        // Use a loop to iterate until the number is not equal to 0
        while (number != 0) {
            // Remove the last digit from the number in each iteration and add it to the array
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, index);
                digits = temp;
            }
            digits[index] = number % 10; 
            number /= 10;
            index++;
        }

        // Define variable to store largest and second largest digit and initialize it to zero
        int largest = 0;
        int secondLargest = 0;

        // Loop through the array and use conditional statements to find the largest and second largest number in the array
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Finally display the largest and second-largest number
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
