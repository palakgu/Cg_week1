import java.util.*;
public class Occurrences{
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string");
        String input = sc.nextLine();
System.out.println("Enter the Substring ");
        String substring = sc.nextLine();
        int count = countOccurrences(input, substring);
        System.out.println(count);
    }

    public static int countOccurrences(String str, String sub) {
        char[] strChars = str.toCharArray();
        char[] subChars = sub.toCharArray();
        int strLength = strChars.length;
        int subLength = subChars.length;
        int count = 0;

        for (int i = 0; i <= strLength - subLength; i++) {
            boolean match = true;
            for (int j = 0; j < subLength; j++) {
                if (strChars[i + j] != subChars[j]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                count++;
            }
        }

        return count;
    }
}
