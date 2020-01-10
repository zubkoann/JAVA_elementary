package com.lessons;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework9 {
    public static final Scanner s = new Scanner(System.in);
    public static final Random rand = new Random();

    public static void main(String[] args) {
        getEventArray(10);
        getTaskWithStar();
    }

    public static void getEventArray(int n) {
        int[] array = new int[n];
        int count = 0;
        int min = 2;
        int max = 20;
        int diff = max - min;
        String stringArray;
        String stringArray2;


        while (count < n) {
            int i = rand.nextInt(diff + 1) + min;
            if (i % 2 == 0) {
                array[count] = i;
                count++;
            }
        }

        stringArray = Arrays.toString(array);
        stringArray = stringArray.replace("[", "");
        stringArray = stringArray.replace("]", "");
        stringArray = stringArray.replace(", ", " ");
        stringArray2 = stringArray.replace(" ", "\n");

        System.out.println(stringArray);
        System.out.println(stringArray2);
    }

    public static void getTaskWithStar() {
        int[] array = new int[8];
        int[] array2 = new int[8];

        int min = 1;
        int max = 10;
        int diff = max - min;
        String stringArray;
        String stringArray2;

        for (int i = 0; i < array.length; i++) {
            int a = rand.nextInt(diff + 1) + min;
            array[i] = a;
            if (i % 2 == 1) {
                array2[i] = 0;
            } else {
                array2[i] = a;
            }
        }

        stringArray = Arrays.toString(array);
        stringArray2 = Arrays.toString(array2);

        System.out.println(stringArray);
        System.out.println(stringArray2);


    }
}
