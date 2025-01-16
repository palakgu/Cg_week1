
public class vovcons2{
    // Method to check if the character is a vowel or consonant
    public static String checkVowelOrConsonant(char ch){
        // Convert the character to lowercase if it is an uppercase letter
        ch = Character.toLowerCase(ch);
        
        // Check if the character is a vowel
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return "Vowel";
        }
        // Check if the character is a consonant
        else if(ch >= 'a' && ch <= 'z'){
            return "Consonant";
        }
        // If the character is not a letter
        else{
            return "Not a Letter";
        }
    }

    // Method to find vowels and consonants in a string
    public static String[][] findVowelsAndConsonants(String str){
        // Initialize a 2D array to store the result
        String[][] result = new String[str.length()][2];
        
        // Iterate over each character in the string
        for(int i = 0; i < str.length(); i++){
            // Get the character at the current index
            char ch = str.charAt(i);
            
            // Check if the character is a vowel or consonant
            String type = checkVowelOrConsonant(ch);
            
            // Store the character and its type in the 2D array
            result[i][0] = String.valueOf(ch);
            result[i][1] = type;
        }
        
        // Return the 2D array
        return result;
    }

    // Method to display the 2D array of strings in a tabular format
    public static void displayResult(String[][] result){
        // Print the header
        System.out.println("Character\tType");
        
        // Iterate over each row in the 2D array
        for(int i = 0; i < result.length; i++){
            // Print the character and its type
            System.out.println(result[i][0] + "\t" + result[i][1]);
        }
    }

    // Main function
    public static void main(String[] args){
        // Take user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        // Find vowels and consonants in the string
        String[][] result = findVowelsAndConsonants(str);
        
        // Display the result
        displayResult(result);
    }
}
