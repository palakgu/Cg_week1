import java.util.*;

class Table {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        // Loop to generate the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            // Print the multiplication in the format: number * i = result
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
