public class basicCalculator {
    public static void main(String[] args) {
        // Prompt the user to choose an operation
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        // Get the user's choice
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int choice = scanner.nextInt();

        // Get the two numbers from the user
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        // Perform the chosen operation
        switch (choice) {
            case 1:
                System.out.println("Result: " + add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + multiply(num1, num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Result: " + divide(num1, num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    // Function to perform addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Function to perform subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Function to perform multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Function to perform division
    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
}