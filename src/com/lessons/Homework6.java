package com.lessons;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        System.out.println("Please enter number >0");
        int number = s.nextInt();
        while (number < 0 && s.hasNextLine()){
            System.out.println("Number is <0 \nPlease enter number >0");
            number = s.nextInt();
        }
        while (number != 0){
            sum +=number%10;
            number = number/10;
        }
        if (sum == 10)
            System.out.println("Sum equals 10");
        else
            System.out.println("Sum doesn't equal 10");
    }
}
