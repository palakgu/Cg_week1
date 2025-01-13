
public class StudentVoteChecker {
    public boolean canStudentVote(int age) {
        // Check if age is negative
        if (age < 0) {
            return false; // cannot vote
        }
        // Check if age is 18 or above
        return age >= 18;
    }

    public static void main(String[] args) {
        StudentVoteChecker voteChecker = new StudentVoteChecker();
        int[] studentAges = new int[10];

        // Take user input for the age of all 10 students
        for (int i = 0; i < 10; i++) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

        // Check whether the student can vote
        for (int i = 0; i < 10; i++) {
            if (voteChecker.canStudentVote(studentAges[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
    }
}
