
import java.util.Scanner;
public class IllegalArgument {
    public static void main(String[] args) {
        generateException();
        handleRuntimeException();
    }

    public static void generateException() {
        String str = "Hello";
        try {
            System.out.println(str.substring(3, 1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void handleRuntimeException() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        try {
            System.out.println(str.substring(3, 1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        }
    }
}
