
import java.util.Random;

public class FootballTeam {
    public static void main(String[] args) {
        // Create an array to store the heights of 11 players
        int[] heights = new int[11];

        // Initialize a Random object to generate random heights
        Random random = new Random();

        // Generate 3-digit random heights for each player in the range 150-250
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150; // 101 is used to get a range of 100 (250-150)
        }

        // Calculate the sum of all heights
        int sumOfHeights = findSumOfHeights(heights);

        // Calculate the mean height
        double meanHeight = findMeanHeight(sumOfHeights, heights.length);

        // Find the shortest height
        int shortestHeight = findShortestHeight(heights);

        // Find the tallest height
        int tallestHeight = findTallestHeight(heights);

        // Display the results
        System.out.println("Heights of players: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println("\nSum of heights: " + sumOfHeights);
        System.out.println("Mean height: " + meanHeight);
        System.out.println("Shortest height: " + shortestHeight);
        System.out.println("Tallest height: " + tallestHeight);
    }

    // Method to find the sum of all elements in the array
    public static int findSumOfHeights(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find the mean height of the players
    public static double findMeanHeight(int sum, int n) {
        return (double) sum / n;
    }

    // Method to find the shortest height of the players
    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest height of the players
    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
}