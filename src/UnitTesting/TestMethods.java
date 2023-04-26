package UnitTesting;

public class TestMethods {
    public static double calculateAverage(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
    public static boolean isMatrixSquare(int[][] matrix) {
        int rows = matrix.length;
        for (int i = 0; i < rows; i++) {
            if (matrix[i].length != rows) {
                return false;
            }
        }
        return true;
    }
}
