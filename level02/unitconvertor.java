
public class UnitConvertor {
    // Conversion factor from kilometers to miles
    private static double km2miles = 0.621371;

    // Conversion factor from miles to kilometers
    private static double miles2km = 1.60934;

    // Conversion factor from meters to feet
    private static double meters2feet = 3.28084;

    // Conversion factor from feet to meters
    private static double feet2meters = 0.3048;

    // Method to convert kilometers to miles and return the value
    public static double convertKmToMiles(double km) {
        return km * km2miles;
    }

    // Method to convert miles to kilometers and return the value
    public static double convertMilesToKm(double miles) {
        return miles * miles2km;
    }

    // Method to convert meters to feet and return the value
    public static double convertMetersToFeet(double meters) {
        return meters * meters2feet;
    }

    // Method to convert feet to meters and return the value
    public static double convertFeetToMeters(double feet) {
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        // Test the conversion methods
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a value in kilometers: ");
        double km = scanner.nextDouble();
        System.out.println("Equivalent value in miles: " + convertKmToMiles(km));
        System.out.println("Enter a value in miles: ");
        double miles = scanner.nextDouble();
        System.out.println("Equivalent value in kilometers: " + convertMilesToKm(miles));
        System.out.println("Enter a value in meters: ");
        double meters = scanner.nextDouble();
        System.out.println("Equivalent value in feet: " + convertMetersToFeet(meters));
        System.out.println("Enter a value in feet: ");
        double feet = scanner.nextDouble();
        System.out.println("Equivalent value in meters: " + convertFeetToMeters(feet));
    }
}
