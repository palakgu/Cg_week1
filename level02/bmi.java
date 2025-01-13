
public class bmi {
    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        // Convert height from cm to m
        double heightInM = height / 100;
        // Calculate BMI
        double bmi = weight / (heightInM * heightInM);
        return bmi;
    }

    // Method to determine BMI status
    public static String determineStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        // Initialize 2D array to store weight, height, and BMI
        double[][] data = new double[10][3];

        // Take user input for weight and height
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();

            // Calculate BMI
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
        }

        // Display height, weight, BMI, and status of each individual
        System.out.println("Height (cm)\tWeight (kg)\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.println(data[i][1] + "\t\t" + data[i][0] + "\t\t" + data[i][2] + "\t\t" + determineStatus(data[i][2]));
        }
    }
}
