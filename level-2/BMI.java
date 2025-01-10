
public class BMI {
    // Main method to execute the program
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Prompt the user to enter their weight in kg
        System.out.print("Enter weight in kg: ");
        // Read the weight from the user
        double weight = scanner.nextDouble();

        // Prompt the user to enter their height in cm
        System.out.print("Enter height in cm: ");
        // Read the height from the user
        double height = scanner.nextDouble();

        // Convert the height from cm to meters
        double heightInMeter = height / 100;
        // Calculate the BMI using the formula: weight / (height * height)
        double bmi = weight / (heightInMeter * heightInMeter);

        // Display the calculated BMI
        System.out.println("Your BMI is: " + bmi);

        // Determine the BMI category based on the calculated value
        if (bmi < 18.5) {
            // Underweight category
            System.out.println("Underweight");
        } else if (bmi < 25) {
            // Normal weight category
            System.out.println("Normal");
        } else if (bmi < 30) {
            // Overweight category
            System.out.println("Overweight");
        } else {
            // Obese category
            System.out.println("Obese");
        }
    }
}
