public class anagram {
    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if the lengths of the two texts are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create arrays to store the frequency of characters in the strings
        int[] charCount1 = new int[256]; // Assuming ASCII characters
        int[] charCount2 = new int[256];

        // Find the frequency of characters in the two texts
        for (int i = 0; i < text1.length(); i++) {
            charCount1[text1.charAt(i)]++;
            charCount2[text2.charAt(i)]++;
        }

        // Compare the frequency of characters in the two texts
        for (int i = 0; i < 256; i++) {
            if (charCount1[i] != charCount2[i]) {
                return false;
            }
        }

        // If the frequencies are equal, return true
        return true;
    }

    public static void main(String[] args) {
        // Take user inputs
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();
        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        // Call the user-defined method and display the result
        if (areAnagrams(text1, text2)) {
            System.out.println(text1 + " and " + text2 + " are anagrams.");
        } else {
            System.out.println(text1 + " and " + text2 + " are not anagrams.");
        }
    }
}