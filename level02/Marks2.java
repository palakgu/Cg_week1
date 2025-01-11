import java.util.*;
public class Marks2 {
    public static void main(String[] args) {
        // Create a new Scanner object to read user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Prompt user to enter number of students
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();

        // Create a 2D array to store marks
        double[][] marks = new double[numStudents][3];

        // Prompt user to enter marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1));
            System.out.print("Enter marks in Physics: ");
            marks[i][0] = scanner.nextDouble();
            System.out.print("Enter marks in Chemistry: ");
            marks[i][1] = scanner.nextDouble();
            System.out.print("Enter marks in Maths: ");
            marks[i][2] = scanner.nextDouble();
        }

        // Calculate total marks, average marks, and percentage for each student
        for (int i = 0; i < numStudents; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3;
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

            // Display results for each student
            System.out.println("Student " + (i + 1));
            System.out.println("Average Mark: " + average);
            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Level: " + grade);
            System.out.println("Remarks: " + remarks);
            System.out.println();
        }
    }
}