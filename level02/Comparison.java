import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Arrays to store ages and heights
        int[] ages = new int[3];
        int[] heights = new int[3];
        
        // Input for ages and heights
        System.out.println("Enter the ages of Amar, Akbar, and Anthony:");
        for (int i = 0; i < 3; i++) {
            ages[i] = scanner.nextInt();
        }

        System.out.println("Enter the heights of Amar, Akbar, and Anthony (in cm):");
        for (int i = 0; i < 3; i++) {
            heights[i] = scanner.nextInt();
        }
        
        // Finding the youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        
        // Finding the tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        
        // Output results
        String[] friends = {"Amar", "Akbar", "Anthony"};
        System.out.println("The youngest friend is: " + friends[youngestIndex]);
        System.out.println("The tallest friend is: " + friends[tallestIndex]);
    }
}
