package com.lessons;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number;
        int sum = 0;
        System.out.println("Please enter number");
        number = s.nextInt();
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }
        System.out.println("Summ is " + sum);
    }
}
