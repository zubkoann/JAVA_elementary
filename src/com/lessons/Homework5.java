package com.lessons;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data;
        int length;
        boolean flag = false;
        System.out.println("Please enter number");
        data = s.nextLine();
        length = data.length();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (data.charAt(i) == data.charAt(j) && !flag && i != j) {
                    flag = true;
                    System.out.println("Tere is match ");
                    break;
                }
            }
            if (flag) break;
        }
        if (!flag)
            System.out.println("Tere is NO match");
    }
}