package com.lessons;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
//        getTask1();
        getTask2("i love java");
        getTask3();
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
     * @return
     */

    public static String getTask2(String str) {
        String[] array =str.split("\\s");
        StringBuilder str2 = new StringBuilder();
        for (String word:array){
            String a = word.substring(0,1).toUpperCase();
            String b = word.substring(1, word.length()).toLowerCase();
            str2.append(a).append(b+ " ");
        }
        return str2.toString().trim();
    }

    /**
     3) Создать генератор паролей, который будет генерировать случайные пароли по следующим правилам:
     Пароль состоит из 8 символов
     В пароле допускаются только латинские большие и маленькие буквы, цифры и символ подчеркивания
     Пароль обязательно должен содержать Большие и маленькие буквы и цифры
     */

    public static String getTask3() {
        StringBuilder str = new StringBuilder();
        Random rand = new Random();
        final int START_NUM = '0';
        final int END_NUM = '9';
        final int START_CHAR_BIG = 'A';
        final int END_CHAR_BIG = 'Z';
        final int START_CHAR_SM = 'a';
        final int END_CHAR_SM = 'z';
        final int UNDERSCOR = '_';
        while (str.length()<9){
            int num = rand.nextInt( 122-48+ 1) + 48;;
            if ((num>=START_NUM && num<=END_NUM) || (num>=START_CHAR_BIG && num<=END_CHAR_BIG)
                    ||(num>=START_CHAR_SM && num<=END_CHAR_SM) || num == UNDERSCOR){
                str.append((char) num);
            }
        }
        return str.toString();
    }
}
