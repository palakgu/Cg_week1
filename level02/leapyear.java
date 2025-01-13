
public class leapyear {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        scanner.close();

        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }

   
    public static boolean isLeapYear(int year) {
        // Check if the year is >= 1582
        if (year < 1582) {
            throw new IllegalArgumentException("Year must be >= 1582");
        }

        // Check if the year is divisible by 4
        boolean a = year % 4 == 0;
        // Check if the year is not divisible by 100 or divisible by 400
        boolean b = year % 100 != 0 || year % 400 == 0;

        // A year is a leap year if both conditions are true
        return a && b;
    }
}
