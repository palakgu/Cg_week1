
import java.util.Scanner;
public class wordreplace {
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        if (sentence == null || oldWord == null || newWord == null) {
            return sentence;
        }
        return sentence.replace(oldWord, newWord);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        System.out.println("Enter the old word to replace:");
        String oldWord = scanner.nextLine();
        System.out.println("Enter the new word:");
        String newWord = scanner.nextLine();
        scanner.close();
        String replacedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println("Replaced sentence: " + replacedSentence);

    }
}
