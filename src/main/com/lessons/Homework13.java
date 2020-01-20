package com.lessons;

import java.util.Arrays;

public class Homework13 {
    public static void main(String[] args) {
//        getTask1();
//        getTask2(1, 2, 3, 4, 5.5);
//        getTask3("+", new int[]{1, 2, 4, 5, 67, 3, 4});
//        getTask4("123+321");
//        getTask4("123+3898721");
//        getTask5("I liKE JAVA");
        System.out.println(getTask6("123124235436"));
        System.out.println(getTask6("dgdfgfdgfh"));
    }

//    1) Привести пример каждого из вышеперечисленным методов String и парочку методов StringBuilder

    public static void getTask1() {
        String s = "I like learn Java";
        String s2 = "I like learn Java";
        String s3 = "I LIKE learn Java   ";
        System.out.println("charAt " + s.charAt(3));
        System.out.println("contains " + s.contains("contains"));
        System.out.println("endsWith " + s.endsWith("a"));
        System.out.println("startsWith " + s.startsWith("I"));
        System.out.println("equals " + s.equals(s2));
        System.out.println("equalsIgnoreCase " + s.equalsIgnoreCase(s3));
        System.out.println("indexOf " + s.indexOf("l"));
        System.out.println("isEmpty " + s.isEmpty());
        System.out.println("length " + s.length());
        System.out.println("replace " + s.replace('i', 'I'));
        String subst = s.substring(2);
        System.out.println("substring " + subst);
        String subst2 = s.substring(2, 6);
        System.out.println("substring2 " + subst2);
        System.out.println("toLowerCase " + s.toLowerCase());
        System.out.println("toUpperCase " + s.toUpperCase());
        System.out.println("trim " + s3.trim());
        char[] array = s.toCharArray();
        System.out.println("toCharArray " + Arrays.toString(array));
        System.out.println("valueOf " + String.valueOf(12345));
        System.out.println("format " + String.format("I %s java %s month", "learn", 3));
        System.out.println("split " + Arrays.toString(s.split("\\s+")));

        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("My name ").append("is Anna");
        strBuilder.toString();
        System.out.println("strBuilder " + strBuilder);
        System.out.println("strBuilder " + strBuilder.reverse());
    }

    //2) Написать метод в который можно передать неопределенное число типа int, а метод вернет среднее арифметическое, например int avg = average(1,2,3,4,5);
    public static void getTask2(double... number) {
        double sum = 0;
        for (double val : number) {
            sum += val;
        }
        double average = (double) (sum / number.length);
        System.out.println("average " + average);
    }

    //3) Написать метод. Входящий параметр String separator.
//    Метод должен вернуть строку в которой все числа от 1 до 10 через separator.
//    Например если separator = "+" то результат будет "1+2+3..."
    public static void getTask3(String separator, int[] array) {
        StringBuilder str = new StringBuilder();
        for (int num : array) {
            str.append(num).append(separator);
        }
        System.out.println(str);
    }

    //4) Проверить является ли строка палиндром, т.е. читается в обоих направления одинаково, например: `121`, `test_tset`, `12345678987654321`, `_asdf.fdsa_`.
    public static void getTask4(String s) {
        if (s.equals((new StringBuilder(s)).reverse().toString())) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    //5*) Написать метод: входящий параметр - строка. Метод должен вернуть ту же строку
// где все маленькие буквы заменены на большие а остальные символы остались
// без изменений, не используя методы toUpperCase/toLowerCase
    public static void getTask5(String s) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int unicod = (char) s.charAt(i);
            if (unicod > 64 && unicod < 91) {
                unicod += 32;
                newStr.append((char) unicod);
            } else if (unicod > 96 && unicod < 123) {
                unicod -= 32;
                newStr.append((char) unicod);
            } else {
                newStr.append(" ");
            }
        }
        System.out.println(newStr);
    }

    //6*) Написать метод который проверяет состоит ли строка из одних только цифр. Метод должен вернуть true или false
    public static boolean getTask6(String s) {
        if (s.matches("\\d+")) {
            return true;
        }
        return false;
    }
}
