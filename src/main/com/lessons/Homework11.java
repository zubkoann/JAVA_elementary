package com.lessons;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework11 {
    private static Scanner s = new Scanner(System.in);
    private static Random rand = new Random();


    public static void main(String[] args) {
//        getTask1();
//        getTask2();
//        getTask3();
//        getTask4();
//        getTask5();
//        getTask6();
//        getTask7();
//        getTask8();
//        getTask9();
//        getTask10();
//        getTask11();
//        int[] array = getTask12();
//        getTask13(array);
//        getTask14();
//        getTask15();
        getTask16();


    }

    //1) Попросить пользователя ввести его вес.
    //    На луне вес будет в 6 раз меньше. Вывести вес этого человека на луне.
    private static void getTask1() {
        double weight;
        System.out.println("Enter your weight");
        weight = s.nextDouble();
        System.out.println("Your weight at the moon " + weight / 6);
    }

    //    2) Попросить пользователя ввести ФИО (3 переменные).
    //    Используя один оператор print() вывести в ФИО 3 строки ("\n").
    private static void getTask2() {
        String name;
        String surname;
        String middlename;
        System.out.println("Enter your name");
        name = s.next();
        System.out.println("Enter your surname");
        surname = s.next();
        System.out.println("Enter your middlename");
        middlename = s.next();

        System.out.printf("%s \n%s  \n%s", surname, name, middlename);
    }

    //    3) Попросить пользователя ввести месяц.
    //    Используя оператор switch вывести какая это пора года, или сказать что месяц введен с ошибкой.
    private static void getTask3() {
        int month;
        System.out.println("Enter month");
        if (s.hasNextInt()) {
            month = s.nextInt();
            switch (month) {
                case 1:
                case 2:
                case 12:
                    System.out.println("Winter");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Spring");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Summer");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Autumn");
                    break;

                default:
                    System.out.println("You have entered wrong month");
                    break;
            }
        } else {
            System.out.println("You should enter number");
        }
    }

    //    4) Население земли 7 500 000 000 человек
    //    Если предположить что каждый год оно будет увеличиваться на 10% вывести количество людей через 3 года.
    private static void getTask4() {
        long people = 7500000000L;
        int count = 0;
        while (count < 3) {
            people = (long) (people * 1.1);
            count++;
        }
        System.out.print(people);
    }

    //    5) Попросить пользователя ввести 2 числа.
    //    Используя тернарный оператор ( ?: ) вывести меньшее из них.
    private static void getTask5() {
        int number1;
        int number2;
        String text;

        System.out.println("Enter number 1");
        number1 = s.nextInt();
        System.out.println("Enter number 2");
        number2 = s.nextInt();
        text = (number1 >= number2) ? "number1 >= number2" : "number1 < number2";

        System.out.println(text);
    }

    //     6) Попросить пользователя ввести 3 числа.
    //     Используя if-else вывести минимальное и максимальное из этих чисел.
    private static void getTask6() {
        int number1;
        int number2;
        int number3;

        System.out.println("Enter number 1");
        number1 = s.nextInt();
        System.out.println("Enter number 2");
        number2 = s.nextInt();
        System.out.println("Enter number 3");
        number3 = s.nextInt();

        if (number1 >= number2 && number1 >= number3) {
            System.out.printf("number1 is biggest number %d \n", number1);
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.printf("number2 is biggest number %d \n", number2);
        } else {
            System.out.printf("number3 is biggest number %d \n", number3);
        }

        if (number1 <= number2 && number1 <= number3) {
            System.out.printf("number1 is smallest number %d", number1);
        } else if (number2 <= number1 && number2 <= number3) {
            System.out.printf("number2 is smallest number %d", number2);
        } else {
            System.out.printf("number3  is smallest number  %d", number3);
        }


    }

    //    7) Попросить пользователя ввести 3 числа типа int.
    //    Вывести их среднее арифметическое.

    private static void getTask7() {
        int number1;
        int number2;
        int number3;
        double average;
        System.out.println("Enter number 1");
        number1 = s.nextInt();
        System.out.println("Enter number 2");
        number2 = s.nextInt();
        System.out.println("Enter number 3");
        number3 = s.nextInt();
        average = (double) (number1 + number2 + number3) / 3;
        System.out.println("average " + average);
    }

    //    8) Просмотреть методы Math:
    //    https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
    //    Пользователь вводит 2 катета прямоугольного треугольника. Найти гипотенузу.
    private static void getTask8() {
        double cathet1;
        double cathet2;
        double hepatenosis;
        System.out.println("Katet 1");
        cathet1 = s.nextDouble();
        System.out.println("Katet 2");
        cathet2 = s.nextDouble();

        hepatenosis = Math.hypot(cathet1, cathet2);
        System.out.println("gepatenuza " + hepatenosis);
    }

    //  9) Пользователь вводит 2 числа a,b. Вывести целое случайное число в диапазоне a..b включительно
    private static void getTask9() {
        System.out.println("Enter number 1 ");
        int a = s.nextInt();
        System.out.println("Enter number 2 ");
        int b = s.nextInt();

        int max = Math.max(b, a);
        int min = Math.min(a, b);
        int diff = max - min;
        int i = rand.nextInt(diff + 1) + min;

        System.out.println("Random " + i);
    }

    //  10) Вывести числа от 100 до 200 кратные 17
    private static void getTask10() {
        String text = "";
        for (int k = 100; k < 200; k++) {
            if (k % 17 == 0) {
                text += " " + k + ",";
            }
        }
        System.out.println(text);
    }

    //  11) Заполнить массив из 10 элементов по убыванию: первый элемент = 10, второй 9, итд.
    private static void getTask11() {
        int[] array = new int[10];
        String stringArray;

        for (int i = 0; i < array.length; i++) {
            array[i] = array.length - i;
        }

        stringArray = Arrays.toString(array);
        System.out.println(stringArray);
    }

    //    12*) Задать массив из 10 случайных чисел, и вывеcти минимальный элемент массива и его индекс.

    private static int[] getTask12() {
        int[] array = new int[10];
        int max = 20;
        int min = 10;
        int diff;
        int minInArray = 0;
        int indexMin = 0;
        String stringArray;

        diff = max - min;
        for (int k = 0; k < array.length; k++) {
            array[k] = rand.nextInt(diff + 1) + min;
            if (k == 0) {
                minInArray = array[k];
            } else {
                for (int i = 0; i < k; i++) {
                    if (minInArray > array[k]) {
                        minInArray = array[k];
                        indexMin = k;
                    }
                }
            }

        }
        stringArray = Arrays.toString(array);
        System.out.println(stringArray);
        System.out.println("minInArray " + minInArray);
        System.out.println("indexMin " + indexMin);

        return array;

    }

    //13*) Написать метод который возвращает среднее арифметическое массива который передан как параметр.

    private static void getTask13(int[] array) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            count += array[i];
        }

        System.out.println("average: " + (double) count / array.length);
    }

    //14*) Простая игра и цикл while:
    //Компьютер задумывает число от 1 до 1000 и просит вас ввести число.
    //После этого он говорит вы угадали или число больше меньше.
    //Продолжается до тех пор пока пользователь не угадает число.
    private static void getTask14() {

        int min = 1;
        int max = 1000;
        int diff = max - min;
        int number = rand.nextInt(diff + 1) + min;
        int guessNumber;

        do {
            System.out.println("try to guess the number ");
            guessNumber = s.nextInt();

            if (guessNumber > number) {
                System.out.println("guessNumber > number");
            } else {
                System.out.println("guessNumber < number");
            }


        } while (guessNumber != number);

        System.out.println("CONGRATULATE!!!! YOU HAVE WIN!");


    }
//    1) Написать программу которая решает квадратное уравнение вида a*x*x + b*x + c = 0, где заданы a,b,c.

    private static void getTask15() {

        double a, b, c;
        double D;

        System.out.println("Enter a, b и c:");
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();

        D = b * b - 4 * a * c;
        System.out.println(D);

        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println(" x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println(" x = " + x);
        } else {
            System.out.println("no roots of the equation");
        }

    }


    //    Написать программу которая вычисляет значения корня квадратного без использования библиотечных методов типа Math.sqrt().
//    Например методом половинного деления.
    public static void getTask16() {
        int number = 100;
        double t;
        double squareRoot = number / 2;
        do {
            t = squareRoot;
            squareRoot = (t + (number / t)) / 2;
        } while ((t - squareRoot) != 0);
        System.out.println(squareRoot);
    }

}
