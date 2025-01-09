import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        System.out.println("The addition value of the two numbers " + number1 + " and " + number2 + " is " + addition);
        System.out.println("The subtraction value of the two numbers " + number1 + " and " + number2 + " is " + subtraction);
        System.out.println("The multiplication value of the two numbers " + number1 + " and " + number2 + " is " + multiplication);
        System.out.println("The division value of the two numbers " + number1 + " and " + number2 + " is " + division);
        
        scanner.close();
    }
}