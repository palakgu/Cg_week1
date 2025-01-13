import java.util.Random;

public class MatrixOperate {

    // Method to create a random matrix of given rows and columns
    public static int[][] createRandomMatrix(int rows, int columns) {
        Random random = new Random();
        int[][] matrix = new int[rows][columns];

        // Fill the matrix with random integers between 0 and 9
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }

        return matrix;
    }

    // Method to display an integer matrix
    public static void displayIntMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method to display a double matrix (for inverse results)
    public static void displayDoubleMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%.2f\t", matrix[i][j]); // Printing rounded to 2 decimal places
            }
            System.out.println();
        }
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] result = new int[rows][columns];

        // Add corresponding elements of the matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] result = new int[rows][columns];

        // Subtract corresponding elements of the matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        // Check if multiplication is possible
        if (cols1 != rows2) {
            throw new IllegalArgumentException("Matrix multiplication is not possible. Columns of matrix1 must equal rows of matrix2.");
        }

        int[][] result = new int[rows1][cols2];

        // Multiply matrices
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] result = new int[columns][rows];

        // Swap rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    // Method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            throw new IllegalArgumentException("Matrix must be 2x2.");
        }
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to find the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException("Matrix must be 3x3.");
        }
        int determinant = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) 
                        - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                        + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        return determinant;
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            throw new IllegalArgumentException("Matrix must be 2x2.");
        }

        int determinant = determinant2x2(matrix);
        if (determinant == 0) {
            throw new ArithmeticException("Matrix is singular and cannot be inverted.");
        }

        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) determinant;
        inverse[0][1] = -matrix[0][1] / (double) determinant;
        inverse[1][0] = -matrix[1][0] / (double) determinant;
        inverse[1][1] = matrix[0][0] / (double) determinant;

        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(int[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException("Matrix must be 3x3.");
        }

        int determinant = determinant3x3(matrix);
        if (determinant == 0) {
            throw new ArithmeticException("Matrix is singular and cannot be inverted.");
        }

        double[][] adjugate = new double[3][3];
        adjugate[0][0] = matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1];
        adjugate[0][1] = -(matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]);
        adjugate[0][2] = matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1];
        adjugate[1][0] = -(matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
        adjugate[1][1] = matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0];
        adjugate[1][2] = -(matrix[0][0] * matrix[1][2] - matrix[0][2] * matrix[1][0]);
        adjugate[2][0] = matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0];
        adjugate[2][1] = -(matrix[0][0] * matrix[2][1] - matrix[0][1] * matrix[2][0]);
        adjugate[2][2] = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];

        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = adjugate[i][j] / determinant;
            }
        }

        return inverse;
    }

    public static void main(String[] args) {
        // Example: Create two random matrices of size 3x3
        int rows = 3;
        int cols = 3;

        int[][] matrix1 = createRandomMatrix(rows, cols);
        int[][] matrix2 = createRandomMatrix(rows, cols);

        System.out.println("Matrix 1:");
        displayIntMatrix(matrix1);

        System.out.println("Matrix 2:");
        displayIntMatrix(matrix2);

        // Addition of matrices
        System.out.println("Matrix 1 + Matrix 2:");
        displayIntMatrix(addMatrices(matrix1, matrix2));

        // Subtraction of matrices
        System.out.println("Matrix 1 - Matrix 2:");
        displayIntMatrix(subtractMatrices(matrix1, matrix2));

        // Multiplication of matrices
        try {
            System.out.println("Matrix 1 * Matrix 2:");
            displayIntMatrix(multiplyMatrices(matrix1, matrix2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Transpose of matrix
        System.out.println("Transpose of Matrix 1:");
        displayIntMatrix(transposeMatrix(matrix1));

        // Determinant of a 2x2 matrix
        int[][] matrix2x2 = createRandomMatrix(2, 2);
        System.out.println("2x2 Matrix:");
        displayIntMatrix(matrix2x2);
        System.out.println("Determinant of 2x2 Matrix: " + determinant2x2(matrix2x2));

        // Determinant of a 3x3 matrix
        System.out.println("Determinant of Matrix 1 (3x3): " + determinant3x3(matrix1));

        // Inverse of a 2x2 matrix
        try {
            double[][] inverse2x2 = inverse2x2(matrix2x2);
            System.out.println("Inverse of 2x2 Matrix:");
            displayDoubleMatrix(inverse2x2);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Inverse of a 3x3 matrix
        try {
            double[][] inverse3x3 = inverse3x3(matrix1);
            System.out.println("Inverse of Matrix 1 (3x3):");
            displayDoubleMatrix(inverse3x3);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

