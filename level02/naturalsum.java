
public class naturalsum {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a natural number:");
        int n = scanner.nextInt();
        scanner.close();

        if (n <= 0) {
            System.out.println("Input is not a natural number.");
            System.exit(0);
        }

        int recursiveSum = findRecursiveSum(n);
        int formulaSum = findFormulaSum(n);

        System.out.println("Sum of " + n + " natural numbers using recursion: " + recursiveSum);
        System.out.println("Sum of " + n + " natural numbers using formula: " + formulaSum);

        if (recursiveSum == formulaSum) {
            System.out.println("Both computations produce the same result.");
        } else {
            System.out.println("Both computations do not produce the same result.");
        }
    }

    // Method to find the sum of n natural numbers using recursion
    public static int findRecursiveSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + findRecursiveSum(n - 1);
        }
    }

    // Method to find the sum of n natural numbers using the formulae n*(n+1)/2
    public static int findFormulaSum(int n) {
        return n * (n + 1) / 2;
    }
}
