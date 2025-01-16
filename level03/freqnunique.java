public class freqnunique {
    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                count++;
            }
        }
        char[] unique = new char[count];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                unique[index++] = str.charAt(i);
            }
        }
        return unique;
    }

    // Method to find the frequency of characters in a string
    public static String[][] findFrequency(String str) {
        int[] frequency = new int[256];
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }
        char[] unique = uniqueCharacters(str);
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(frequency[unique[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        String[][] result = findFrequency(str);
        System.out.println("Character\tFrequency");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }
}