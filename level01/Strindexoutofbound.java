
public class Strindexoutofbound {
    public static void main(String[] args) {
        generateException();
        handleException();
    }

    public static void generateException() {
        String str = "Hello";
        System.out.println("String: " + str);
        System.out.println("Length of the String: " + str.length());
        System.out.println("Trying to access index beyond the length of the String...");
        try {
            System.out.println("Character at index 10: " + str.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
 
    public static void handleException() { 
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter an index to access: ");
        int index = scanner.nextInt();
        scanner.close();
        try {
            System.out.println("Character at index " + index + ": " + str.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
