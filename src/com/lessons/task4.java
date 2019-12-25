package com.lessons;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a");
        int a = s.nextInt();
        System.out.println("Enter b");
        int b = s.nextInt();
        System.out.println("Enter c");
        int c = s.nextInt();

        if (a>b){
            System.out.println("a is  more ");
        } else {
            System.out.println("b is  more or equal a ");
        }

        int firstTask = a + (b*c)/2;
        System.out.println("firstTask " + firstTask);

        double secondTask = (Math.pow(a, 2) + Math.pow(b, 2))/2;
        System.out.println("secondTask " + secondTask);

        double thirdTask = ((a + b)/12*c) % 4 + b;
        System.out.println("thirdTask " + thirdTask);

        double fourthTask = (a - b*c)/(a + b) % c;
        System.out.println("fourthTask" + fourthTask);

        double fifthTask = Math.abs(a - b) / Math.pow((a + b), 3) - Math.cos(c);
        System.out.println("fifthTask" + fifthTask);

    }
}
