public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "your input string here";
        String result = removeDuplicates(input);
        System.out.println(result);
    }

    public static String removeDuplicates(String str) {
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < chars.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if (chars[i] == chars[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
}
