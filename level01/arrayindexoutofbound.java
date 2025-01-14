
public class arrayindexoutofbound {
    public static void main(String[] args) {
        generateException();
        handleException();
    }

    public static void generateException() {
        String[] names = {"John", "Alice", "Bob"};
        System.out.println("Generating ArrayIndexOutOfBoundsException...");
        try {
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void handleException() {
        String[] names = {"John", "Alice", "Bob"};
        System.out.println("Handling ArrayIndexOutOfBoundsException...");
        try {
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
