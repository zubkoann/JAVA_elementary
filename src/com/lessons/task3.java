package com.lessons;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your weight");
        double weight = s.nextDouble();
        double weightMoon = weight * 0.17;
        System.out.println("You weight at Moon " + weightMoon);
        }
}
