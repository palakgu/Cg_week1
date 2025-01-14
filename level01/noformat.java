
public class noformat {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter the String:");
        String str = scanner.nextLine();
        generateNumberFormatException(str);
        handleNumberFormatException(str);
    }

    public static void generateNumberFormatException(String text) {
        
        try {
            int number = Integer.parseInt(text);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
    }

    public static void handleNumberFormatException(String text) {
        
        try {
            int number = Integer.parseInt(text);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException: " + e.getMessage());
        }
    }
}
