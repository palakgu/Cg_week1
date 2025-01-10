import java.util.*;
public class Leapyear2 {
    public static void main(String[] args) {
        // Create a new Scanner object to read user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        // Prompt the user to enter a year
        System.out.println("Enter a year: ");
        
        // Read the year from the user
        int year = scanner.nextInt();
        
        // Close the Scanner object to prevent resource leaks
        scanner.close();

        // Check if the year is a leap year according to the Gregorian calendar rules
        if ((year >= 1582) && ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))) {
            // If the year is a leap year, print a message indicating so
            System.out.println(year + " is a Leap Year.");
        } else {
            // If the year is not a leap year, check if it's before the introduction of the Gregorian calendar
            if (year < 1582) {
                // If the year is before 1582, print a message indicating that the year should be greater than or equal to 1582
                System.out.println("Year should be greater than or equal to 1582.");
            } else {
                // If the year is not a leap year and is after 1582, print a message indicating so
                System.out.println(year + " is not a Leap Year.");
            }
        }
    }
}