import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input values for first number, operator, and second number
        System.out.print("Enter the first number: ");
        double first = sc.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        String op = sc.next();

        System.out.print("Enter the second number: ");
        double second = sc.nextDouble();

        // Perform the operation based on the input operator using switch...case
        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                // Check for division by zero
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
                break;
        }
    }
}
