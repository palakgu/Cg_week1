public class datecomparison {
    public static void main(String[] args) {
        // Define two dates
        java.time.LocalDate date1 = java.time.LocalDate.of(2022, 1, 1);
        java.time.LocalDate date2 = java.time.LocalDate.of(2022, 1, 15);

        // Compare the dates
        compareDates(date1, date2);
    }


    public static void compareDates(java.time.LocalDate date1, java.time.LocalDate date2) {
        // Check if date1 is before date2
        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is before " + date2);
        }
        // Check if date1 is after date2
        else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is after " + date2);
        }
        // If date1 is neither before nor after date2, they must be the same
        else {
            System.out.println(date1 + " is the same as " + date2);
        }
    }
}