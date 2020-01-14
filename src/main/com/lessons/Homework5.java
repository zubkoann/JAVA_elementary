package com.lessons;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number;
        int count = 0;
        System.out.println("Please enter number");
        number = s.nextInt();
        while (number > 0) {
            int k = number % 10;
            number = number / 10;
            int l = number % 10;
            int number2 = number / 10;

            while (l > 0) {
                if (k == l) {
                    count++;
                    break;

                } else {
                    l = number2 % 10;
                    number2 = number2 / 10;
                }

            }
            if (count > 0) break;

        }
        if (count > 0)
            System.out.println("There is match ");
        else
            System.out.println("There is NO match");

    }
}