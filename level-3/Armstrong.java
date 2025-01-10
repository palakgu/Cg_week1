import java.util.*;

class Armstrong {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        // Initialize sum to 0 and store the original number
        int sum = 0;
        int originalNumber = number;

        // Loop to calculate the sum of the cubes of each digit
        while (originalNumber != 0) {
            // Find the last digit of the number
            int digit = originalNumber % 10;
            
            // Calculate the cube of the digit and add it to the sum
            sum += digit * digit * digit;
            
            // Remove the last digit of the original number
            originalNumber /= 10;
        }

        // Check if the calculated sum is equal to the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }
}
