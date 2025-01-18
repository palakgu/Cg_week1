public class Temperature {
    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        // Formula: Celsius = (Fahrenheit - 32) * 5/9
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        // Formula: Fahrenheit = Celsius * 9/5 + 32
        return celsius * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        // Test the functions
        double fahrenheit = 100;
        double celsius = 37.78;

        System.out.println(fahrenheit + " Fahrenheit is equal to " + fahrenheitToCelsius(fahrenheit) + " Celsius");
        System.out.println(celsius + " Celsius is equal to " + celsiusToFahrenheit(celsius) + " Fahrenheit");
    }
}