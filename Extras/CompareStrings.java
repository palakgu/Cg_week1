import java.util.*;
public class CompareStrings {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        int result = compareStrings(str1, str2);
        
        if (result == 0) {
            System.out.println("The strings are equal.");
        } else if (result < 0) {
            System.out.println("The first string is lexicographically smaller.");
        } else {
            System.out.println("The first string is lexicographically larger.");
        }
    }

    public static int compareStrings(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();
        int minLength = Math.min(length1, length2);

        for (int i = 0; i < minLength; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (char1 != char2) {
                return char1 - char2;
            }
        }

        return length1 - length2;
    }
}
