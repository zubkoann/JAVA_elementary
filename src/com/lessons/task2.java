package com.lessons;

import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;


public class task2 {
    public static void main(String[] args) {
        double side1;
        double side2;
        double hypot;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first catet");
        side1 = s.nextDouble();
        System.out.println("Enter second catet");
        side2 = s.nextDouble();
        hypot = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        System.out.println("hypotinuza is " + hypot);
    }
}
