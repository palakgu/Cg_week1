
public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        generateNullPointerException();
        handleNullPointerException();
    }

    public static void generateNullPointerException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught in generateNullPointerException method");
        }
    }

    public static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught in handleNullPointerException method");
            throw new RuntimeException("NullPointerException occurred while accessing string method", e);
        }
    }
}
