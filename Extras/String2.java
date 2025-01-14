import java.util.Scanner; // Import the Scanner class to read user input

public class PallindromeString {
    public static void main(String[] args) {
        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Read the input string from the user
        String s = sc.nextLine();
        
        // Check if the input string is a palindrome by calling the isPalindrome method
        if (isPalindrome(s) == true) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String input) {
        int left = 0; // Initialize the left pointer
        int right = input.length() - 1; // Initialize the right pointer
        
        // Loop through the string until the pointers meet in the middle
        while (left < right) {
            // Check if the characters at the pointers are not the same
            if (input.charAt(left) != input.charAt(right)) {
                return false; // If not, the string is not a palindrome
            }
            left++; // Move the left pointer towards the center
            right--; // Move the right pointer towards the center
        }
        
        return true; // If all characters match, the string is a palindrome
    }
}