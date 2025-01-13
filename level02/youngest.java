
public class youngest {
    public static void main(String[] args) {
        // Take user input for age and height for the 3 friends
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter the age of Amar:");
        int amarAge = scanner.nextInt();
        System.out.println("Enter the height of Amar:");
        int amarHeight = scanner.nextInt();

        System.out.println("Enter the age of Akbar:");
        int akbarAge = scanner.nextInt();
        System.out.println("Enter the height of Akbar:");
        int akbarHeight = scanner.nextInt();

        System.out.println("Enter the age of Anthony:");
        int anthonyAge = scanner.nextInt();
        System.out.println("Enter the height of Anthony:");
        int anthonyHeight = scanner.nextInt();

        // Store the values for age and height of the 3 friends in arrays
        int[] ages = {amarAge, akbarAge, anthonyAge};
        int[] heights = {amarHeight, akbarHeight, anthonyHeight};

        // Find the youngest of the 3 friends
        String youngestFriend = findYoungest(ages, "Amar", "Akbar", "Anthony");
        System.out.println("The youngest friend is: " + youngestFriend);

        // Find the tallest of the 3 friends
        String tallestFriend = findTallest(heights, "Amar", "Akbar", "Anthony");
        System.out.println("The tallest friend is: " + tallestFriend);
    }

    // Method to find the youngest of the 3 friends
    public static String findYoungest(int[] ages, String... names) {
        int minAge = ages[0];
        String youngest = names[0];
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = names[i];
            }
        }
        return youngest;
    }

    // Method to find the tallest of the 3 friends
    public static String findTallest(int[] heights, String... names) {
        int maxHeight = heights[0];
        String tallest = names[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = names[i];
            }
        }
        return tallest;
    }
}
