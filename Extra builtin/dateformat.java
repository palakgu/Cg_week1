public class dateformat {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();

        // Create SimpleDateFormat objects for different date formats
        java.text.SimpleDateFormat sdf1 = new java.text.SimpleDateFormat("dd/MM/yyyy"); // dd/MM/yyyy format
        java.text.SimpleDateFormat sdf2 = new java.text.SimpleDateFormat("yyyy-MM-dd"); // yyyy-MM-dd format
        java.text.SimpleDateFormat sdf3 = new java.text.SimpleDateFormat("EEE, MMM dd, yyyy"); // EEE, MMM dd, yyyy format

        // Print the current date in different formats
        System.out.println("Current Date in dd/MM/yyyy format: " + sdf1.format(date));
        System.out.println("Current Date in yyyy-MM-dd format: " + sdf2.format(date));
        System.out.println("Current Date in EEE, MMM dd, yyyy format: " + sdf3.format(date));
    }
}