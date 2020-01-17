package com.lessons;

/**
 * 4*) Вычислить чиcло PI с точность несколько знаков после запятой:
 * a) ряд Лейбница:
 * PI = (4/1) - (4/3) + (4/5) - (4/7) + (4/9) - (4/11) + (4/13) - (4/15) ...
 * b) ряд Нилаканта:
 * PI = 3 + 4/(2*3*4) - 4/(4*5*6) + 4/(6*7*8) - 4/(8*9*10) + 4/(10*11*12) - (4/(12*13*14) ...
 * Определить какой из рядов дает необходимую точность при меньшем количестве итераций.
 */
public class Homework12_4 {
    public static void main(String[] args) {
        int iterationLeibniz = (int) iterPiLeibniz(0.001);
        int iterationNicolaz = (int) iterPiNicolaz(0.001);
        String text = (iterationNicolaz > iterationLeibniz) ? "ряд Нилаканта" : "ряд Лейбница";

        System.out.println(text);

    }

    public static double iterPiLeibniz(double epsilon) {
        int n = 1;
        double myPi = 4;
        int factor = -4;

        while (Math.abs(Math.PI - myPi) > epsilon) {
            myPi += (double) factor / (n * 2 + 1);
            n++;
            factor = -factor;
        }

        return n;
    }

    public static double iterPiNicolaz(double epsilon) {
        double myPi = 3;
        int a = 2;
        int b = 3;
        int c = 4;
        int n = 0;

        while (Math.abs(Math.PI - myPi) > epsilon) {
            myPi += (n % 2 == 0 ? 1 : -1) * 4.0 / (a * b * c);
            a += 1;
            b += 1;
            c += 1;
            n++;
        }
        return n;
    }


}
