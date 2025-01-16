import java.util.Scanner;

class StringSplitter {

    public static int findLengthWithoutLengthMethod(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }

    public static String[] splitTextIntoWords(String text) {
        int length = findLengthWithoutLengthMethod(text);
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int index = 0;
String str="";

        for (int i = 0; i < length; i++) {
            if(text.charAt(i)!=' '){
str+=text.charAt(i);

}else{
words[index++]=str;
str="";
}
  }
if(str.length()>0) words[index]=str;
        return words;
    }

    public static boolean compareStringArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();

        String[] customSplitWords = splitTextIntoWords(userInput);

        String[] builtInSplitWords = userInput.split(" ");

        boolean areEqual = compareStringArrays(customSplitWords, builtInSplitWords);

        System.out.println("Words using custom method: ");
        for (String word : customSplitWords) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split() method: ");
        for (String word : builtInSplitWords) {
            System.out.println(word);
        }

        System.out.println("\nAre the two methods equal? " + areEqual);

        scanner.close();
    }
}
