
public class Primeornot {
    public static void main(String[] args) {
        // Take input from the user
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Initialize a boolean variable to store the result
        boolean isPrime = true;

        // Check if the number is less than or equal to 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Loop through all the numbers from 2 to the user input number
            for (int i = 2; i < number; i++) {
                // Check if the number is divisible by any other number
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Print the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
