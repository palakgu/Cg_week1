
import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        int sumOfFactors = findSumOfFactors(factors);
        System.out.println("\nSum of factors: " + sumOfFactors);

        long productOfFactors = findProductOfFactors(factors);
        System.out.println("Product of factors: " + productOfFactors);

        double sumOfSquareOfFactors = findSumOfSquareOfFactors(factors);
        System.out.println("Sum of square of factors: " + sumOfSquareOfFactors);
    }

    // Method to find the factors of a number and return them in an array
    public static int[] findFactors(int number) {
        // First loop to find the count of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize the array with the count
        int[] factors = new int[count];

        // Second loop to save the factors into the array
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to find the sum of the factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors
    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the sum of square of the factors
    public static double findSumOfSquareOfFactors(int[] factors) {
        double sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }
}
