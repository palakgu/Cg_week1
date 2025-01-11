import java.util.*;

class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students ");
        int num = sc.nextInt();
        double[] phy = new double[num];
        double[] chem = new double[num];
        double[] maths = new double[num];
        String[] grade = new String[num];
        double[] percent = new double[num];

        System.out.println("Enter the marks of the students");
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the marks of the student " + (i + 1) + " in physics");
            phy[i] = sc.nextDouble();
            System.out.println("Enter the marks of the student " + (i + 1) + " in maths");
            maths[i] = sc.nextDouble();
            System.out.println("Enter the marks of the student " + (i + 1) + " in chemistry");
            chem[i] = sc.nextDouble();
        }

        for (int i = 0; i < num; i++) {
            double total = phy[i] + chem[i] + maths[i];
            double average = total / 3;
            double percentage = (total / 300) * 100;

            // Determine grade and remarks based on percentage
            if (percentage >= 80) {
                grade[i] = "A";
            } else if (percentage >= 70) {
                grade[i] = "B";
            } else if (percentage >= 60) {
                grade[i] = "C";
            } else if (percentage >= 50) {
                grade[i] = "D";
            } else if (percentage >= 40) {
                grade[i] = "E";
            } else {
                grade[i] = "R";
            }

            // Display results for each student
            System.out.println("Student " + (i + 1));
            System.out.println("Average Mark: " + average);
            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Grade: " + grade[i]);
            System.out.println();
        }
    }
}
