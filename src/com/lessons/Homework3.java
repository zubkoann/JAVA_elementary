package com.lessons;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Homework3 {
    public static void main(String[] args) {
        int number1 = getInt("first");
        char operation = getOperation();
        int number2 = getInt("second");
        int result = calc(number1, number2, operation);
        System.out.println("RESULT: " + result);
    }
    static Scanner s = new Scanner(System.in);
    static int getInt(String num){
        System.out.println("Enter " + num + " number");
        int number;
        if (s.hasNextInt()){
            number = s.nextInt();
        }else {
            System.out.println("Something going wrong with " + num);
            s.next();
            number = getInt(num);
        }
        return  number;
    }
    static  char getOperation(){
        System.out.println("Enter operation");
        char operation;
        if (s.hasNext()){
            operation = s.next().charAt(0);
        }else {
            System.out.println("Something going wrong");
            s.next();
            operation = getOperation();
        }
        return  operation;
    }
    static  int calc(int number1, int number2, char operation){
        int result;
        switch (operation){
            case '+':
                result =   number1 + number2;
                break;
            case '-':
                result =   number1 - number2;
                break;
            case '/':
                result =   number1 / number2;
                break;
            case '*':
                result =   number1 * number2;
                break;
            case '%':
                result =   number1 % number2;
                break;
            default:
                System.out.println("Operation is wrong");
                result = calc( number1,  number2, getOperation());
        }
        return result;
    }
}
