package com.lessons;

public class Task7 {
    public static void main(String[] args) {
        getTask1();
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
}
