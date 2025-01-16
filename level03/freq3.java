public class freq3 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int[] freq = new int[ch.length];
        String[] result = new String[ch.length];

        // Initialize frequency of each character to 1
        for (int i = 0; i < ch.length; i++) {
            freq[i] = 1;
        }

        // Find the frequency of each character
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    freq[i]++;
                    // Set duplicate characters to '0' to avoid counting them again
                    ch[j] = '0';
                }
            }
        }

        // Store the characters and their frequencies in a 1D array
        int k = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '0') {
                result[k] = "Character: " + ch[i] + ", Frequency: " + freq[i];
                k++;
            }
        }

        // Display the result
        System.out.println("Frequency of characters:");
        for (int i = 0; i < k; i++) {
            System.out.println(result[i]);
        }
    }
}