
public class mostfreq {
    public static void main(String[] args) {
        String str = "success";
        char mostFrequentChar = findMostFrequentChar(str);
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }

    public static char findMostFrequentChar(String str) {
        int[] charCount = new int[256]; // assuming ASCII characters
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }
        int maxCount = 0;
        char mostFrequentChar = ' ';
        for (int i = 0; i < 256; i++) {
            if (charCount[i] > maxCount) {
                maxCount = charCount[i];
                mostFrequentChar = (char) i;
            }
        }
        return mostFrequentChar;
    }
}
