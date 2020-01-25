package com.lessons;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
//        getTask1();
        getTask2("i love java");
    }

    /**
     * 1) Вывести в 1 строку через пробел все числа от 1 до 99 со следующими изменениями:
     * - если число кратно 3 то вывести вместо него Hello
     * - если число кратно 5 то вывести вместо него World
     * - если число кратно и 3 и 5 то вывести вместо него HelloWorld
     */

    public static void getTask1() {

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("HelloWorld ");
            } else if (i % 3 == 0) {
                System.out.print("Hello ");
            } else if (i % 5 == 0) {
                System.out.print("World ");
            }else{
                System.out.printf("%s ", i);
            }
        }
    }


    /**2) Написать метод.
    Входящий параметр:
    Строка со словами разделенными пробелом которые состоят из больших и маленьких букв.
    Метод должен вернуть ту же строку в которой первая буква в каждом слове большая, а остальные маленьк
     */

    public static void getTask2(String str) {
        String[] array =str.split("\\s");
        StringBuilder str2 = new StringBuilder();
        for (String word:array){
            String a = word.substring(0,1).toUpperCase();
            String b = word.substring(1, word.length());
            str2.append(a).append(b+ " ");
        }
        System.out.println(str2);
    }

}
