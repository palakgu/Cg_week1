import java.util.Scanner;

public class StringLength {

    // Method to find the length of the string without using the length() method
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception will be caught when the index is out of bounds
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String userInput = scanner.next();

        // Calling the user-defined method
        int userDefinedLength = findLength(userInput);

        // Using the built-in length() method
        int builtInLength = userInput.length();

        // Displaying the result
        System.out.println("Length of the string using user-defined method: " + userDefinedLength);
        System.out.println("Length of the string using built-in length() method: " + builtInLength);

        scanner.close();
    }
}
