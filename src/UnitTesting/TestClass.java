package UnitTesting;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestClass {

    @Test
    public void testCalculateAverage() {
        int[] arr1 = {1, 2, 3, 4, 5};
        double expected1 = 3.0;
        double result1 = TestMethods.calculateAverage(arr1);
        assertEquals(expected1, result1, 0.0001);

        int[] arr2 = {-10, 0, 10};
        double expected2 = 0.0;
        double result2 = TestMethods.calculateAverage(arr2);
        assertEquals(expected2, result2, 0.0001);

        int[] arr3 = {2};
        double expected3 = 2.0;
        double result3 = TestMethods.calculateAverage(arr3);
        assertEquals(expected3, result3, 0.0001);
    }

    @Test
    public void testIsMatrixSquare() {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        boolean expected1 = true;
        boolean result1 = TestMethods.isMatrixSquare(matrix1);
        assertEquals(expected1, result1);

        int[][] matrix2 = {{1, 2}, {3, 4}, {5, 6}};
        boolean expected2 = false;
        boolean result2 = TestMethods.isMatrixSquare(matrix2);
        assertEquals(expected2, result2);

        int[][] matrix3 = {{1}};
        boolean expected3 = true;
        boolean result3 = TestMethods.isMatrixSquare(matrix3);
        assertEquals(expected3, result3);
    }
}