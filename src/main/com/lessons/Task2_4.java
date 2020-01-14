package com.lessons;

import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a");
        float a = s.nextInt();
        System.out.println("Enter b");
        float b = s.nextInt();
        System.out.println("Enter c");
        float c = s.nextInt();

        if (a > b) {
            System.out.println("a is  more ");
        } else {
            System.out.println("b is  more or equal a ");
        }

        float firstTask = a + (b * c) / 2;
        System.out.println("firstTask " + firstTask);

        double secondTask = (Math.pow(a, 2) + Math.pow(b, 2)) / 2;
        System.out.println("secondTask " + secondTask);

        float thirdTask = ((a + b) / 12 * c) % 4 + b;
        System.out.println("thirdTask " + thirdTask);

        float fourthTask = (a - b * c) / (a + b) % c;
        System.out.println("fourthTask" + fourthTask);

        double fifthTask = Math.abs(a - b) / Math.pow((a + b), 3) - Math.cos(c);
        System.out.println("fifthTask" + fifthTask);

    }
}
