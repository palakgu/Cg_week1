public class Fibonacci {
    // Function to calculate and print the Fibonacci sequence
    public static void printFibonacci(int n) {
        // Initialize the first two numbers in the sequence
        int num1 = 0;
        int num2 = 1;

        // Print the first two numbers
        System.out.print(num1 + " " + num2);

        // Calculate and print the remaining numbers in the sequence
        for (int i = 2; i < n; i++) {
            int sum = num1 + num2;
            System.out.print(" " + sum);
            num1 = num2;
            num2 = sum;
        }
    }

    public static void main(String[] args) {
        // Prompt the user to enter the number of terms
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Check if the input is a positive integer
        if (n > 0) {
            // Print the Fibonacci sequence
            System.out.println("Fibonacci sequence up to " + n + " terms:");
            printFibonacci(n);
        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}