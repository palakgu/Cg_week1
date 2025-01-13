import java.util.*;

class TrigonometricFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter an angle in degrees
        System.out.println("Enter an angle in degrees:");
        double angle = sc.nextDouble();
        
        // Calculate the trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle);
        
        // Print the results
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
    }
    
    // Method to calculate trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert the angle to radians
        double radians = Math.toRadians(angle);
        
        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        
        // Store the results in an array
        double[] results = {sine, cosine, tangent};
        
        // Return the array with the trigonometric values
        return results;
    }
}
