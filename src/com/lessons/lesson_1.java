package com.lessons;

import java.util.Scanner;

public class lesson_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your first name please");
        String first_name = s.nextLine();
        System.out.println("Enter your middle name please");
        String middle_name = s.nextLine();
        System.out.println("Enter your last name please");
        String last_name = s.nextLine();
        System.out.println(last_name+' '+first_name+' '+middle_name);
    }
}
