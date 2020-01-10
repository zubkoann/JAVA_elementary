package com.lessons;

import java.util.Arrays;
import java.util.Random;

public class Task4_3 {
    public static void main(String[] args) {
        getEventArray(10);

    }

    public static void getEventArray(int n) {
        int[] array = new int[n];
        int count = 0;

        while (count <= n) {
            Random random = new Random();

            array[count] = random.nextInt(20) + 2;
            count++;

        }
        String stringArray = Arrays.toString(array);
        System.out.print(stringArray);

    }
}
