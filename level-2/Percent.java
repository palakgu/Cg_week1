
import java.util.*;
public class Percent {
    public static void main(String[] args) {
        // Create a new Scanner object to read user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Prompt user to enter marks in Physics
        System.out.print("Enter marks in Physics: ");
        double physics = scanner.nextDouble();

        // Prompt user to enter marks in Chemistry
        System.out.print("Enter marks in Chemistry: ");
        double chemistry = scanner.nextDouble();

        // Prompt user to enter marks in Maths
        System.out.print("Enter marks in Maths: ");
        double maths = scanner.nextDouble();

        // Calculate total marks
        double total = physics + chemistry + maths;

        // Calculate average marks
        double average = total / 3;

        // Calculate percentage
        double percentage = (total / 300) * 100;

        // Initialize grade and remarks variables
        String grade = "";
        String remarks = "";

        // Determine grade and remarks based on percentage
        if (percentage >= 80) {
            grade = "A";
            remarks = "Level=4,above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level=3,at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level=2,Below, but approaching  agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level=1,Well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level=1,too below agency-normalizde standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Display results
        System.out.println("Average Mark: " + average);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Level: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}
