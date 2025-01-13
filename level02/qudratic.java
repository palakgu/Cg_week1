
import java.util.Scanner;;
public class quadratic {
    public static double[] findRoots(double a, double b, double c) {
        // Calculate delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        // If delta is positive, find two roots
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] { root1, root2 };
        }
        // If delta is zero, find one root
        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[] { root };
        }
        // If delta is negative, return empty array
        else {
            return new double[] {};
        }
    }

    public static void main(String[] args) {
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coefficients of the quadratic equation (a, b, c):");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double[] roots = findRoots(a, b, c);
        if (roots.length == 2) {
            System.out.println("Roots are " + roots[0] + " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("Root is " + roots[0]);
        } else {
            System.out.println("No real roots");
        }
    }
}
