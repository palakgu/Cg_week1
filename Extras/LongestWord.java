public class LongestWord {
    public static void main(String[] args) {
        String input = "your sentence here";
        String longestWord = findLongestWord(input);
        System.out.println(longestWord);
    }

    public static String findLongestWord(String sentence) {
        char[] chars = sentence.toCharArray();
        String currentWord = "";
        String longestWord = "";
        int maxLength = 0;
        int length = chars.length;

        for (int i = 0; i <= length; i++) {
            if (i < length && chars[i] != ' ') {
                currentWord += chars[i];
            } else {
                if (currentWord.length() > maxLength) {
                    maxLength = currentWord.length();
                    longestWord = currentWord;
                }
                currentWord = "";
            }
        }

        return longestWord;
    }
}
