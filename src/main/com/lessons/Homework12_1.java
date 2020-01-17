package com.lessons;

import java.util.Random;
import java.util.Scanner;

public class Homework12_1 {
    public static void main(String[] args) {
        checkEquils();
        checkDifference();
        getSameCoinSide();
        checkGroupBirthday();
    }

    public static final Random RANDOM = new Random();
    public static final Scanner s = new Scanner(System.in);
    public static final int COUNT = 1000000;

    /**
     * 1) Вывести вероятность:
     * - на 2 кубиках выпало одинаковое число
     * - на 3 кубиках все значения разные
     * - на 3 монетках выпало одна сторона
     */
    public static void checkEquils() {
        int count = 0;
        for (int i = 0; i < COUNT; i++) {
            int a1 = dice();
            int a2 = dice();
            if (a1 == a2) {
                count++;
            }
        }
        double equils = count / (double) COUNT * 100;
        System.out.println("equils " + equils);
    }

    public static void checkDifference() {
        int count = 0;
        for (int i = 0; i < COUNT; i++) {
            int a1 = dice();
            int a2 = dice();
            int a3 = dice();
            if (a1 != a2 && a2 != a3 && a3 != a1) {
                count++;
            }
        }
        double difference = count / (double) COUNT * 100;
        System.out.println("difference " + difference);
    }

    public static void getSameCoinSide() {
        int count = 0;
        for (int i = 0; i < COUNT; i++) {
            int a1 = coin();
            int a2 = coin();
            int a3 = coin();
            if (a1 == a2 && a2 == a3 && a3 == a1) {
                count++;
            }
        }
        double sameCoinnside = count / (double) COUNT * 100;
        System.out.println("Same coin side  " + sameCoinnside);
    }

    public static int dice() {
        return RANDOM.nextInt(6) + 1;

    }

    public static int coin() {
        return RANDOM.nextInt(2) + 1;

    }

    //1.1*) Пользователь вводит количество людей в группе, например 30.
//    Вывести вероятность того что как минимум у 2 из них день рождение в 1 один день.
    public static void checkGroupBirthday() {
        System.out.println("How many people at the group?");
        int length = s.nextInt();
        int[] array = new int[length];
        double sameBirthAllGroups = 0;
        int count = 0;

        for (int i = 0; i < COUNT; i++) {
            setBirthday(array);
            if (chekMatchInArray(array)) {
                count++;
            }
            sameBirthAllGroups += count / (double) array.length;
            count = 0;
        }
        double sameBirthPercent = sameBirthAllGroups / (double) COUNT * 100;
        System.out.println("Same day in group birthday " + sameBirthPercent);
    }

    private static boolean chekMatchInArray(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int k = j + 1; k < array.length; k++) {
                if (array[j] == array[k]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void setBirthday(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = RANDOM.nextInt(365) + 1;
        }
    }


}
