public class dataarithmetic {
    public static void main(String[] args) {
        // Get the current date
        java.time.LocalDate date = java.time.LocalDate.now();
        System.out.println("Original Date: " + date);

        // Add 7 days, 1 month, and 2 years to the current date
        date = date.plusDays(7);
        date = date.plusMonths(1);
        date = date.plusYears(2);
        System.out.println("Date after adding 7 days, 1 month, and 2 years: " + date);

        // Subtract 3 weeks from the updated date
        date = date.minusWeeks(3);
        System.out.println("Date after subtracting 3 weeks: " + date);
    }
}