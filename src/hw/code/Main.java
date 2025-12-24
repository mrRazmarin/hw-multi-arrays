package hw.code;

import java.util.Random;

public class Main {

    final static int SIZE = 8;

    public static void main(String[] args) {
        int[][] matrix = new int[SIZE][SIZE];

        fillMatrixRandomNumbers(matrix, 0, 255);

        System.out.println("Исходная матрица:");
        printMatrix(matrix);

        int[][] rotated = rotateOnNinetyClockwiseRow(matrix);

        System.out.println("\nМатрица после поворота на 90 градусов по часовой стрелке:");
        printMatrix(rotated);
    }

    private static void fillMatrixRandomNumbers(int[][] matrix, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }
    }

    private static int[][] rotateOnNinetyClockwiseRow(int[][] matrix) {
        int n = matrix.length;
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[j][n - 1 - i] = matrix[i][j];
            }
        }

        return result;
    }
}
