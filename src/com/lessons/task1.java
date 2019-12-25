package com.lessons;
import java.util.Calendar;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
//        вывести количество лет
        Scanner s = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        System.out.println("Enter your year of birth ");
//        int birthYear = Integer.parseInt(s.nextLine());
        int birthYear = s.nextInt();
        System.out.println("Enter your month of birth ");
        int birthMonth = s.nextInt();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int age = year - birthYear;
        System.out.println(age);
    }
}
