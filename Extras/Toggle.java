import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        toggleWord(str);
    }

    public static void toggleWord(String str) {
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                str2 += (char) (ch - 'a' + 'A');
            } else if (ch >= 'A' && ch <= 'Z') {
                str2 += (char) (ch - 'A' + 'a');
            } else {
                str2 += ch;
            }
        }
        System.out.println("The toggled string is: " + str2);
    }
}
