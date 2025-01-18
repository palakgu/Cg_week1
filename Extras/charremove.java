public class charremove {
    public static void main(String[] args) {
        String str = "Hello World";
        char ch = 'l';
        System.out.println("Original String: " + str);
        System.out.println("Character to Remove: " + ch);
        System.out.println("Modified String: " + removeChar(str, ch));
    }

    public static String removeChar(String str, char ch) {
        return str.replace(String.valueOf(ch), "");
    }
}