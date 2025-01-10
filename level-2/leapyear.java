import java.util.*;
public class Leapyear {
    public static void main(String[] args) {
        // Create a new Scanner object to read user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        // Prompt the user to enter a year
        System.out.println("Enter a year: ");
        
        // Read the year from the user
        int year = scanner.nextInt();
        
        // Close the Scanner object to prevent resource leaks
        scanner.close();

        // Determine if the year is a leap year using multiple if-else statements
        if (year < 1582) {
            // The Gregorian calendar was introduced in 1582, so years before this are not leap years
            System.out.println("Year should be greater than or equal to 1582.");
        } else if (year % 4 != 0) {
            // If the year is not divisible by 4, it is not a leap year
            System.out.println(year + " is not a Leap Year.");
        } else if (year % 100 != 0) {
            // If the year is divisible by 4 but not by 100, it is a leap year
            System.out.println(year + " is a Leap Year.");
        } else if (year % 400 != 0) {
            // If the year is divisible by 100 but not by 400, it is not a leap year
            System.out.println(year + " is not a Leap Year.");
        } else {
            // If the year is divisible by 400, it is a leap year
            System.out.println(year + " is a Leap Year.");
        }

        // Determine if the year is a leap year using one if statement with multiple logical operators
        if (year >= 1582 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            // The year is a leap year if it meets the conditions above
            System.out.println(year + " is a Leap Year.");
        } else if (year >= 1582) {
            // If the year is not a leap year and is greater than or equal to 1582, print a message
            System.out.println(year + " is not a Leap Year.");
        } else {
            // If the year is less than 1582, print a message
            System.out.println("Year should be greater than or equal to 1582.");
        }
    }
}