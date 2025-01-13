
public class unitconvertor2 {
    // Method to convert Fahrenheit to Celsius
    public static double convertFarhenheitToCelsius(double farhenheit) {
        // Formula to convert Fahrenheit to Celsius
        return (farhenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        // Formula to convert Celsius to Fahrenheit
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds) {
        // Conversion factor: 1 pound = 0.453592 kilograms
        return pounds * 0.453592;
    }

    // Method to convert Kilograms to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
        // Conversion factor: 1 kilogram = 2.20462 pounds
        return kilograms * 2.20462;
    }

    // Method to convert Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        // Conversion factor: 1 gallon = 3.78541 liters
        return gallons * 3.78541;
    }

    // Method to convert Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        // Conversion factor: 1 liter = 0.264172 gallons
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Display conversion options
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");
        System.out.println("3. Convert Pounds to Kilograms");
        System.out.println("4. Convert Kilograms to Pounds");
        System.out.println("5. Convert Gallons to Liters");
        System.out.println("6. Convert Liters to Gallons");

        // Prompt user to enter their choice
        System.out.println("Enter your choice: ");

        // Read user's choice
        int choice = scanner.nextInt();


        // Use a switch statement to handle different conversion options
        switch (choice) {
            case 1:
                // Convert Fahrenheit to Celsius
                System.out.print("Enter Fahrenheit temperature: ");
                double fahrenheit = scanner.nextDouble();
                double celsius = convertFarhenheitToCelsius(fahrenheit);
                System.out.printf("%.2f Fahrenheit is %.2f Celsius%n", fahrenheit, celsius);
                break;
            case 2:
                // Convert Celsius to Fahrenheit
                System.out.print("Enter Celsius temperature: ");
                double celsius2 = scanner.nextDouble();
                double fahrenheit2 = convertCelsiusToFahrenheit(celsius2);
                System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", celsius2, fahrenheit2);
                break;
            case 3:
                // Convert Pounds to Kilograms
                System.out.print("Enter Pounds weight: ");
                double pounds = scanner.nextDouble();
                double kilograms = convertPoundsToKilograms(pounds);
                System.out.printf("%.2f Pounds is %.2f Kilograms%n", pounds, kilograms);
                break;
            case 4:
                // Convert Kilograms to Pounds
                System.out.print("Enter Kilograms weight: ");
                double kilograms2 = scanner.nextDouble();
                double pounds2 = convertKilogramsToPounds(kilograms2);
                System.out.printf("%.2f Kilograms is %.2f Pounds%n", kilograms2, pounds2);
                break;
            case 5:
                // Convert Gallons to Liters
                System.out.print("Enter Gallons volume: ");
                double gallons = scanner.nextDouble();
                double liters = convertGallonsToLiters(gallons);
                System.out.printf("%.2f Gallons is %.2f Liters%n", gallons, liters);
                break;
            case 6:
                // Convert Liters to Gallons
                System.out.print("Enter Liters volume: ");
                double liters2 = scanner.nextDouble();
                double gallons3 = convertLitersToGallons(liters2);
                System.out.printf("%.2f Liters is %.2f Gallons%n", liters2, gallons3);
            default:
                // Handle invalid choice
                System.out.println("Invalid choice");
        }
    }
}
