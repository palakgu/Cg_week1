import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for base and height
        System.out.print("Enter the base of the triangle in inches: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle in inches: ");
        double height = scanner.nextDouble();
        
        // Area calculation
        double areaSqIn = 0.5 * base * height; 
        double areaSqCm = areaSqIn * 6.4516;           
        // Height conversions
        double heightCm = height * 2.54; 
        double heightFt = height / 12;  
        double heightIn = height;
        
        // Output
        System.out.println("Area of the triangle: " +areaSqIn + " sq inches or " +areaSqCm+ " sq cm");
        System.out.println("Your Height in cm is " +  heightCm + " while in feet is " + heightFt + " and inches is " + heightIn);
        
    }
}