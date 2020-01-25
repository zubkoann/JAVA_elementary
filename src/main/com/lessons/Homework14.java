package com.lessons;

import java.util.Arrays;
import java.util.Random;


public class Homework14 {
    public static void main(String[] args) {
        int[][] matrix1 = getTask1b();
        int[][] matrix4 = getTask1b();
//        getTask1a(matrix1);
//        matrix1 = getTask1c(matrix1, 10);
//        getTask2a(matrix1, matrix4);
//        getTask2b(matrix4, 8, 9);
//        getTask5(matrix1);
//        getTask6(matrix4);
        int[][] matrix5 = {{1, 2, 3}, {4, 5, 6}};
        getTask7(matrix5);

    }

    public static final Random RANDOM = new Random();

    /**
     * 1) написать 3 метода:
     * a) метод который печатает переданную в него матрицу
     */

    public static void getTask1a(int[][] matrix) {
        System.out.println("getTask1a");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * 1) написать 3 метода:
     * b) метод который заполняет случайными числами переданную в него матрицу
     */
    public static int[][] getTask1b() {
        int[][] matrix = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = RANDOM.nextInt(10) + 1;
            }
        }
        return matrix;
    }

    /**
     * 1) написать 3 метода:
     * c) метод в который передается матрица и число. Метод должен умножить каждый элемент матрицы на число
     * Продемонстрировать работу всех методов.
     */
    public static int[][] getTask1c(int[][] matrix, int number) {
        System.out.println("getTask1c");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[i][j] * number;
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        return matrix;
    }

    /**
     * 2.1*) Написать метод который принимает 2 матрицы одного размера и вернет сумму 2 матриц - каждый элемент будет суммой соотв. элементов матриц параметров.
     */
    public static int[][] getTask2a(int[][] matrixA, int[][] matrixB) {
        System.out.println("getTask2a");
        int[][] matrixSum = matrixA;
        for (int i = 0; i < matrixSum.length; i++) {
            for (int j = 0; j < matrixSum[i].length; j++) {
                matrixSum[i][j] += matrixB[i][j];
                System.out.print(matrixSum[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        return matrixSum;
    }

    /**
     * 2.2*) Написать 2 метода, которым передают матрицу и индексы a, b
     * Первый метод должен поменять 2 строки матрицы местами
     * второй 2 столбца
     */

    public static boolean getTask2b(int[][] matrix, int lineA, int lineB) {
        if (matrix[lineA].length != matrix[lineB].length) return false;
        getTask1a(matrix);
        for (int i = 0; i < matrix[lineA].length; i++) {
            int temp = matrix[lineA][i];
            matrix[lineA][i] = matrix[lineB][i];
            matrix[lineB][i] = temp;
        }
        getTask1a(matrix);
        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][lineA];
            matrix[i][lineA] = matrix[i][lineB];
            matrix[i][lineB] = temp;
        }
        getTask1a(matrix);
        return true;
    }

    /**
     * 5*) Написать метод который найдет минимальный элемент матрицы.
     */
    public static void getTask5(int[][] matrix) {
        int result = Integer.MAX_VALUE;//2147483647
        for (int[] i : matrix) {
            for (int j : i)
                result = Math.min(result, j);
        }
        getTask1a(matrix);
        System.out.println(result);
    }

    /**
     * 6*) написать метод который преобразует матрицу в одномерный массив. Например если матрица была 3x4 то массив будет на 12 элементов.
     */
    public static void getTask6(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[] array2 = new int[rows * columns];
        int count = 0;
        getTask1a(matrix);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array2[count] = matrix[i][j];
                count++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }

    /**
     * 7*) Написать метод который повернет матрицу на 90 градусов. Например:
     * 1,2,3
     * 4,5,6
     * <p>
     * результат
     * 4,1
     * 5,2
     * 6,3
     */
    public static void getTask7(int[][] matrix) {
        int columns = matrix[0].length;
        int rows = matrix.length;
        int[][] newMatrix = new int[columns][rows];
        getTask1a(matrix);
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                newMatrix[i][j] = matrix[matrix.length - 1 - j][i];
            }
        }
        getTask1a(newMatrix);

    }

}
