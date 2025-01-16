
public class space{
    public static void main(String[] args) {
        // Prompt user to enter a string
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Trim the string
        int[] trim = trim(str);
        String trimmedStr = substring(str, trim[0], trim[1]);

        // Use Java's built-in trim method for comparison
        String strTrim = str.trim();

        // Compare the two trimmed strings
        boolean result = compare(trimmedStr, strTrim);

        // Print the results
        System.out.println("Original String: " + str);
        System.out.println("Trimmed String: " + trimmedStr);
        System.out.println("String after using trim() method: " + strTrim);
        System.out.println("Are the two strings equal? " + result);
    }

    //Trims leading and trailing spaces from a string.
    public static int[] trim(String str) {
        int start = 0;
        int end = str.length() - 1;
        // Trim leading spaces
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        // Trim trailing spaces
        while (start <= end && str.charAt(end) == ' ') {
            end--;
        }
        return new int[] { start, end };
    }
// Extracts a substring from the input string.
     
    public static String substring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
// Compares two strings for equality.
    public static boolean compare(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
