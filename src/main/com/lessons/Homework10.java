package com.lessons;

import java.util.Arrays;
import java.util.Random;

public class Homework10 {
    public static final Random rand = new Random();

    public static void main(String[] args) {
        getArray();
        getAttackArray();
        int[] array = {5, 6, 4, 0, 5, 6, 0};
        putZerroToBegine(array);
    }

    private static void getArray() {
        int[] array = new int[4];
        int min = 10;
        int max = 99;
        int diff = max - min;
        String stringArray;
        String flag = "Ascending";

        for (int i = 0; i < array.length; i++) {
            int a = rand.nextInt(diff + 1) + min;
            array[i] = a;
            if (i > 0) {
                if (array[i] <= array[i - 1]) {
                    flag = "Not Ascending";
                }
            }
        }
        stringArray = Arrays.toString(array);

        System.out.println(stringArray);
        System.out.println(flag);
    }

    private static void getAttackArray() {
        int[] array = new int[50];
        int min = 1;
        int max = 50;
        int diff = max - min;
        String stringArray;

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(diff + 1) + min;
            while (i > 0) {
                int count = 0;
                array[i] = rand.nextInt(diff + 1) + min;
                for (int j = 0; j < i; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        break;
                    }
                }
                if (count == 0) break;
            }
        }

        stringArray = Arrays.toString(array);
        System.out.println(stringArray);
    }

    private static void putZerroToBegine(int[] array) {

        String stringArray;
        int count = 0;

        stringArray = Arrays.toString(array);
        System.out.println(stringArray);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = array[count];
                array[count] = 0;
                count++;
            }
        }

        stringArray = Arrays.toString(array);
        System.out.println(stringArray);
    }


}
