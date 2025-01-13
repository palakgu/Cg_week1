import java.util.Scanner;
public class Convertor{


    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }


    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }


    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }


    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }
    public static  double convertGallon2litre(double gallon)
    {
        double gallons2liters = 3.78541;
        return gallons2liters*gallon;
    }
    public static  double convertLitre2gallon(double liter){
        double liters2gallons = 0.264172;
        return liters2gallons * liter;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Example usage
        System.out.println("enter fahreneit value");
        double fahrenheit =sc.nextDouble();
        System.out.println("enter celsius value");


        double celsius = sc.nextDouble();
        System.out.println("enter pounds value");


        double pounds = sc.nextDouble();
        System.out.println("enter kilograms value");


        double kilograms = sc.nextDouble();


        System.out.println("enter gallon value");
        double gallon=sc.nextDouble();


        System.out.println("enter liter");
        double liter=sc.nextDouble();


        System.out.println(fahrenheit + " Fahrenheit is " + convertFahrenheitToCelsius(fahrenheit) + " Celsius.");
        System.out.println(celsius + " Celsius is " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit.");
        System.out.println(pounds + " pounds is " + convertPoundsToKilograms(pounds) + " kilograms.");
        System.out.println(kilograms + " kilograms is " + convertKilogramsToPounds(kilograms) + " pounds.");
        System.out.println(gallon+"gallon is "+convertGallon2litre(gallon)+"liter");
        System.out.println(liter+"liter is"+convertLitre2gallon(liter)+"gallon");
    }
}