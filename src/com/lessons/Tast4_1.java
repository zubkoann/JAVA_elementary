package com.lessons;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tast4_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array = new int[5];
        double[] array2 = new double[5];


//        array = fillArray(s, array, array2);
//        String stringArray = Arrays.toString(array);
//        String stringArray2 = Arrays.toString(array2);
//        System.out.print(stringArray);
//        System.out.print(stringArray2);

//        randomGet();
        maxMinRandom(10);
    }

//    private static void printArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]);
//        }
//    }

    private static int[] fillArray(Scanner s, int[] array, double[] array2) {
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array2[i] = random.nextDouble();
            System.out.println("Enter number");
            array[i] = s.nextInt() * 2;
        }
        return array;
    }

    public static void randomGet() {
        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            System.out.println(random.nextInt(6)+6);

        }
    }
    public static void maxMinRandom(int n) {
        int [] array = new int[n];
        for (int i = 0; i < array.length; i++) {
//            array[i] = (int)Math.round((Math.random()*20)-10);
            Random random = new Random();
            array[i] = random.nextInt(21)-20;

        }
        String stringArray = Arrays.toString(array);
        System.out.print(stringArray);
    }

}
