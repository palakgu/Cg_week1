public class Factorial {
    public static void main(String[] args) {
        int number = readInput();
        long factorial = calculateFactorial(number);
        printOutput(number, factorial);
    }

    private static int readInput() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    private static long calculateFactorial(int number) {
        if (number < 0) {
            throw new ArithmeticException("Factorial is not defined for negative numbers");
        } else if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }
    }

    private static void printOutput(int number, long factorial) {
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}
