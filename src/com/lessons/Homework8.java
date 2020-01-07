package com.lessons;

public class Homework8 {
    public static void main(String[] args) {
        newYearTree(10);
    }

    static void newYearTree(int count){
        int width = 0;

        while (width < count){
            for (int i = 0; i < count-width; i++){
                System.out.print(" ");
            }
            for (int i = 0; i < width*2+1; i++){
                System.out.print("*");
            }
            System.out.println();
            width++;
        }
    }
}
