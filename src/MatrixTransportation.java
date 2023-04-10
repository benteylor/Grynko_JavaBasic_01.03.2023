import java.util.Scanner;

public class MatrixTransportation {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Введіть кількість рядків матриці: ");
            int m = input.nextInt();

            System.out.print("Введіть кількість стовпців матриці: ");
            int n = input.nextInt();

            int[][] matrix = new int[m][n];

            System.out.println("Введіть елементи матриці:");

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = input.nextInt();
                }
            }

            int[][] transpose = new int[n][m];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    transpose[j][i] = matrix[i][j];
                }
            }

            System.out.println("Матриця:");

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("Транспонована матриця:");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(transpose[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
