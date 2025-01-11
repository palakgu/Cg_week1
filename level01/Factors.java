import java.util.*; // Importing all classes from the util package

class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating Scanner object for taking input
        System.out.println("Enter the number");
        int num = sc.nextInt(); // Taking the number as input
        int[] arr = new int[num + 1]; // Declaration of an array to store factors
        int size = 0; // Index variable initialized to 0
        
        // Loop to find and store the factors of the number
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                arr[size++] = i; // Storing the factor in the array and incrementing the index
            }
        }
        
        System.out.println("The factors are:");
        // Loop to display the factors
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}
