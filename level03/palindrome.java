import java.util.Scanner;

public class palindrome{

    // Method to check if a text is palindrome using Logic 1
    public static boolean isPalindromeLogic1(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method to check if a text is palindrome using Logic 2
    public static boolean isPalindromeLogic2(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeLogic2(text, start + 1, end - 1);
    }

    // Method to reverse a string using charAt() method
    public static String reverseString(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return reversed;
    }

    // Method to check if a text is palindrome using Logic 3
    public static boolean isPalindromeLogic3(String text) {
        String reversed = reverseString(text);
        char[] original = text.toCharArray();
        char[] reverse = reversed.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        System.out.println("Is " + text + " a palindrome using Logic 1? " + isPalindromeLogic1(text));
        System.out.println("Is " + text + " a palindrome using Logic 2? " + isPalindromeLogic2(text, 0, text.length() - 1));
        System.out.println("Is " + text + " a palindrome using Logic 3? " + isPalindromeLogic3(text));
    }
}