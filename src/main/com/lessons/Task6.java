package com.lessons;
import java.util.Arrays;
import java.util.Random;

public class Task6 {


        public static final Random RANDOM = new Random();

        public static void main(String[] args) {

            int[] arr = new int[6];

            for (int i = 0; i < 60000000; i++) {
                int value = dice() - 1;
                arr[value]++;
            }
            System.out.println(Arrays.toString(arr));

        }

        /**
         * @return value 1..6 including
         */
        public static int dice() {
            return RANDOM.nextInt(6) + 1;
        }


}
