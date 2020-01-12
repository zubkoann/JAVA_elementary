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

        double f=5.555;// 12-15 знаков после запятой
        int c = (int) f; // явное переопределение
        long l=8987987987987987L;
        int j= (int) l;
        float h = (float) 67.77;// 6 знаков после запятой
//        int-2,1 mlrd  (BigDecimal)
//        double
//        boolean
//        String

//        2 раза shift  поиск по проекту
//        alt + enter подсказка или автоисправление
//        Гердер Шилт книги
//
//     %d мы можем использовать еще ряд спецификаторов для других типов данных:
//     %x: для вывода шестнадцатеричных чисел
//     %f: для вывода чисел с плавающей точкой
//     %e: для вывода чисел в экспоненциальной форме, например, 1.3e+01
//     %c: для вывода одиночного символа
//     %s: для вывода строковых значений

//                System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);



        while (count <= n) {
            Random random = new Random();

            array[count] = random.nextInt(20) + 2;
            count++;

        }
        String stringArray = Arrays.toString(array);
        System.out.print(stringArray);

    }
}
