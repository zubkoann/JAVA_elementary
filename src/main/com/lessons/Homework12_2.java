package com.lessons;

import java.util.Scanner;

public class Homework12_2 {
    public static void main(String[] args) {
        getTask1();
        getTask2();
    }

    public static final Scanner s = new Scanner(System.in);

    /**
     * 2) Человек подтягивается лесенкой: 1 раз, 2 раза, 3 раза, итд.
     * - Подсчитать сколько он всего раз подтянется за N подходов, N задано с клавиатуры
     * 2.1*) каждое подтягивание занимает 5 секунд, перерыв 60 секунд. Вывести сколько времени займет N подходов
     * 2.2*) каждый следующий перерыв на 20% больше, вести общее время в формате mm:ss (например 15:45)
     */
    public static void getTask1() {
        System.out.println("Сколько подходов?");
        int approach = s.nextInt();
        int time = approach * 5 + 60 * (approach - 1);
        int hours = time / 60 / 60;
        int minutes = (time / 60 >= 60) ? (time / 60) % 60 : time / 60;
        int seconds2 = time % 60;

        System.out.println(time);
        System.out.println(hours + ": " + minutes + ": " + seconds2);
    }

    public static void getTask2() {
        System.out.println("Сколько подходов?");
        int approach = s.nextInt();
        double rest = 60.0;
        int time = 0;
        for (int i = 0; i < approach; i++) {
            rest = rest * 1.2;
            time += 5 + rest;
        }

        int hours = time / 60 / 60;
        int minutes = (time / 60 >= 60) ? (time / 60) % 60 : time / 60;
        int seconds2 = time % 60;

        System.out.println(time);
        System.out.println(hours + ": " + minutes + ": " + seconds2);
    }

}
