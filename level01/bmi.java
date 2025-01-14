
public class bmi {
    public static void main(String[] args) {
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (in kg) and height (in cm) for person " + (i + 1));
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            data[i][0] = scanner.nextDouble();
            data[i][1] = scanner.nextDouble();
        }
        String[][] result = calculateBMI(data);
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + result[i][0] + " cm");
            System.out.println("Weight: " + result[i][1] + " kg");
            System.out.println("BMI: " + result[i][2]);
            System.out.println("Status: " + result[i][3]);
            System.out.println();
        }
    }

    public static double[] calculateBMI(double weight, double height) {
        double bmi = weight / Math.pow(height / 100, 2);
        return new double[]{bmi};
    }

    public static String[] calculateStatus(double bmi) {
        if (bmi < 18.5) {
            return new String[]{"Underweight"};
        } else if (bmi < 25) {
            return new String[]{"Normal"};
        } else if (bmi < 30) {
            return new String[]{"Overweight"};
        } else {
            return new String[]{"Obese"};
        }
    }

    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double[] bmi = calculateBMI(data[i][0], data[i][1]);
            String[] status = calculateStatus(bmi[0]);
            result[i][0] = String.valueOf(data[i][1]);
            result[i][1] = String.valueOf(data[i][0]);
            result[i][2] = String.valueOf(bmi[0]);
            result[i][3] = status[0];
        }
        return result;
    }
}
