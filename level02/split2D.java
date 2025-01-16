public class split2D{
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a text:");
        String text = scanner.nextLine();
        String[] words = splitTextIntoWords(text);
        String[][] wordLengths = getWordLengths(words);
        displayWordLengths(wordLengths);
    }

    // Method to split the text into words
    public static String[] splitTextIntoWords(String text) {
        int wordCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++; // For the last word
        String[] words = new String[wordCount];
        int wordIndex = 0;
        String word = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                words[wordIndex++] = word;
                word = "";
            } else {
                word += c;
            }
        }
        words[wordIndex] = word; // For the last word
        return words;
    }

    // Method to find the length of a string
    public static int findStringLength(String str) {
        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            length++;
        }
        return length;
    }

    // Method to get the word lengths
    public static String[][] getWordLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(findStringLength(words[i]));
        }
        return wordLengths;
    }

    // Method to display the word lengths
    public static void displayWordLengths(String[][] wordLengths) {
        System.out.println("Word\tLength");
        for (int i = 0; i < wordLengths.length; i++) {
            System.out.println(wordLengths[i][0] + "\t" + Integer.parseInt(wordLengths[i][1]));
        }
    }
}