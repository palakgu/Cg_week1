import java.util.*;
public class Bmi2 {
    // Main method to execute the program
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Prompt the user to enter the number of persons
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        // Initialize a 2D array to store weight, height, and BMI of each person
        double[][] personData = new double[number][3];

        // Initialize an array to store the weight status of each person
        String[] weightStatus = new String[number];

        // Loop through each person to input their weight and height
        for (int i = 0; i < number; i++) {
            // Prompt the user to enter the weight of the current person
            System.out.print("Enter the weight of person " + (i + 1) + " in kg: ");
            personData[i][0] = scanner.nextDouble();
            while (personData[i][0] < 0) {
                System.out.print("Weight cannot be negative. Please enter a positive value: ");
                personData[i][0] = scanner.nextDouble();
            }

            // Prompt the user to enter the height of the current person
            System.out.print("Enter the height of person " + (i + 1) + " in meters: ");
            personData[i][1] = scanner.nextDouble();
            while (personData[i][1] < 0) {
                System.out.print("Height cannot be negative. Please enter a positive value: ");
                personData[i][1] = scanner.nextDouble();
            }
        }

        // Loop through each person to calculate their BMI and status
        for (int i = 0; i < number; i++) {
            // Calculate the BMI using the formula: weight / (height * height)
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine the status based on the BMI
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Print the header for the output table
        System.out.println("Height\tWeight\tBMI\tStatus");

        // Loop through each person to print their details
        for (int i = 0; i < number; i++) {
            // Print the height, weight, BMI, and status of the current person
            System.out.println(personData[i][1] + "\t" + personData[i][0] + "\t" + String.format("%.2f", personData[i][2]) + "\t" + weightStatus[i]);
        }
    }
}