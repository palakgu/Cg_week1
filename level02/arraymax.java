
public class arraymax {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        arraymax obj = new arraymax();
        int[] numbers = obj.generate4DigitRandomArray(size);
        double[] result = obj.findAverageMinMax(numbers);
        System.out.println("Average: " + result[0]);
        System.out.println("Min: " + result[1]);
        System.out.println("Max: " + result[2]);
    }

    public int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    public double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        double min = numbers[0];
        double max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        double average = sum / numbers.length;
        return new double[] { average, min, max };
    }
}
