package com.lessons;

import java.util.Arrays;
import java.util.Scanner;

public class Homework12_3 {
    public static void main(String[] args) {
        getTask1();
    }

    public static final Scanner s = new Scanner(System.in);

    /**
     * 3*) Написать метод которому передаются массив и 2 числа a,b.
     * Метод должен вывести в 1 строку элементы массива между индексами a и b включая a и не включая b.
     * Если индексы не в пределах массива то вместо массива напечатать об этом.
     * Например если массив на 10 элементов и a=0, b=10 то метод выведет весь массив,
     * а при a=0, b=3 первые 3 элемента - 0, 1, 2.
     */
    public static void getTask1() {
        System.out.println("How many Elements of array?");
        int length = s.nextInt();
        int[] array = new int[length];
        System.out.println("a?");
        int a = s.nextInt();
        System.out.println("b?");
        int b = s.nextInt();
        if (a > b) {
            System.out.println("Начало диапазона не может быть больше его конца!!!");
            return;
        } else if (a < 0 || b - a > array.length) {
            System.out.println("Индексы не в пределах массива!");
            return;
        } else {
            setArray(array, a);
//            System.out.println(Arrays.toString(array));
            int[] tmpArr = new int[b - a];
            System.arraycopy(array, 0, tmpArr, 0, b - a);
            System.out.println(Arrays.toString(tmpArr));
        }
    }

    private static void setArray(int[] arr, int a) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a + i;
        }
    }

}
