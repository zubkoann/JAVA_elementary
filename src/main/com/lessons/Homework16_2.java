package com.lessons;

import java.util.Arrays;

import static java.util.Arrays.*;

public class Homework16_2 {
    public static void main(String[] args) {
        int[] brickSides1 = {5, 4, 2};
        int[] holeSides1 = {1, 3};
        int[] brickSides2 = {5, 4, 1};
        int[] holeSides2 = {1, 5};
        System.out.println(checkBrick(brickSides1, holeSides1));
        System.out.println(checkBrick(brickSides2, holeSides2));


    }

    /**
     * 2*) Дан кирпич со сторонами a,b,c и отверстие со сторонами x,y. Определить пройдет ли кирпич в отверстие.
     * Например кирпич со сторонами 2,3,2 не пройдет в отверстие 1x50.
     */
    public static boolean checkBrick(int[] brickSides, int[] holeSides) {
        sort(brickSides);
        sort(holeSides);

        if (brickSides[0] <= holeSides[0] && brickSides[1] <= holeSides[1]) {
            return true;
        } else {
            return false;
        }
    }
}
