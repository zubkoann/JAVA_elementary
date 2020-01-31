package com.lessons;

import java.util.Arrays;
import java.util.Random;

public class Homework15 {
    public static void main(String[] args) {
//        getTask1();
//        getTask2("i love java");
//        getTask3();

        getFastesSortMethod();

    }


    public static int[] getArray() {
        Random rand = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10) + 1;
        }
        return array;
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
            } else {
                System.out.printf("%s ", i);
            }
        }
    }


    /**
     * 2) Написать метод.
     * Входящий параметр:
     * Строка со словами разделенными пробелом которые состоят из больших и маленьких букв.
     * Метод должен вернуть ту же строку в которой первая буква в каждом слове большая, а остальные маленьк
     *
     * @return
     */

    public static String getTask2(String str) {
        String[] array = str.split("\\s");
        StringBuilder str2 = new StringBuilder();
        for (String word : array) {
            String a = word.substring(0, 1).toUpperCase();
            String b = word.substring(1, word.length()).toLowerCase();
            str2.append(a).append(b + " ");
        }
        return str2.toString().trim();
    }

    /**
     * 3) Создать генератор паролей, который будет генерировать случайные пароли по следующим правилам:
     * Пароль состоит из 8 символов
     * В пароле допускаются только латинские большие и маленькие буквы, цифры и символ подчеркивания
     * Пароль обязательно должен содержать Большие и маленькие буквы и цифры
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
        while (str.length() < 9) {
            int num = rand.nextInt(122 - 48 + 1) + 48;
            ;
            if ((num >= START_NUM && num <= END_NUM) || (num >= START_CHAR_BIG && num <= END_CHAR_BIG)
                    || (num >= START_CHAR_SM && num <= END_CHAR_SM) || num == UNDERSCOR) {
                str.append((char) num);
            }
        }
        return str.toString();
    }

    /**
     * 4*) Реализовать 3 сортировки массива. Сравнить их по быстродействию:
     * Bubble
     */
    public static long getBubbleSort() {
        int[] array = getArray();
        System.out.println(Arrays.toString(array));
        long start = System.nanoTime();

        for (int i = 0; i < array.length - 1; i++)
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        long finish = System.nanoTime();

        long timeConsumedMillis = finish - start;
        System.out.println("Bubble " + Arrays.toString(array));
        System.out.println("time " + timeConsumedMillis);
        return timeConsumedMillis;
    }

         /** Insert */

    public static long getInsertSort() {
        int[] array = getArray();
        System.out.println(Arrays.toString(array));
        long start = System.nanoTime();

        for (int i = 1; i < array.length; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        long finish = System.nanoTime();
        long timeConsumedMillis = finish - start;
        System.out.println("Insert " + Arrays.toString(array));
        System.out.println("time " + timeConsumedMillis);
        return timeConsumedMillis;
    }

    /**     * Select*/

     public static long getSelectSort() {
        int[] array = getArray();
        System.out.println(Arrays.toString(array));
        long start = System.nanoTime();

        for (int i = 0; i < array.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[min_index])
                    min_index = j;
            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }
        long finish = System.nanoTime();

        long timeConsumedMillis = finish - start;
        System.out.println("Select " + Arrays.toString(array));
        System.out.println("time " + timeConsumedMillis);
        return timeConsumedMillis;
    }

    /**
     * 5**) Реализовать 3 сложные сортировки массива
     * Quick,
     * Heap,
     * Merge
     */

    public static void getQuickSort(int[] array, int start, int length) {
        if (start >= length) {
            return;
        }

        int middleIndex = start + (length - start) / 2;
        int middle = array[middleIndex];

        int i = start, j = length;
        while (i <= j) {
            while (array[i] < middle) {
                i++;
            }
            while (array[j] > middle) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (start < j)
            getQuickSort(array, start, j);

        if (length > i)
            getQuickSort(array, i, length);
    }

     /**      * Heap, */



     /**      * Merge*/
     public static void getMergeSort(int[] array, int left, int right) {
        if (right <= left) return;
        int mid = (left + right) / 2;

        getMergeSort(array, left, mid);
        getMergeSort(array, mid + 1, right);
        mergeSort(array, left, mid, right);

    }

    public static void mergeSort(int[] array, int left, int mid, int right) {
        // вычисляем длину
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        // создаем временные подмассивы
        int leftArray[] = new int[lengthLeft];
        int rightArray[] = new int[lengthRight];

        // копируем отсортированные массивы во временные
        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[left + i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array[mid + i + 1];

        // итераторы содержат текущий индекс временного подмассива
        int leftIndex = 0;
        int rightIndex = 0;

        // копируем из leftArray и rightArray обратно в массив
        for (int i = left; i < right + 1; i++) {
            // если остаются нескопированные элементы в R и L, копируем минимальный
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            // если все элементы были скопированы из rightArray, скопировать остальные из leftArray
            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            // если все элементы были скопированы из leftArray, скопировать остальные из rightArray
            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }


    /**
     * 6*) Сравнить все сортировки по быстродействию, результат предоставить например в excel или google doc
     */
    public static void getFastesSortMethod() {
        String[] methodNames = {"BubbleSort", "InsertSort", "SelectSort", "QuickSort", "mergeSort"};
        long[] timeArray = new long[methodNames.length];

        timeArray[0] = getBubbleSort();
        timeArray[1] = getInsertSort();
        timeArray[2] = getSelectSort();

        int[] arrayQuickSort = getArray();
        System.out.println(Arrays.toString(arrayQuickSort));
        long start = System.nanoTime();
        getQuickSort(arrayQuickSort, 0, arrayQuickSort.length - 1);
        long finish = System.nanoTime();
        long timeConsumedMillis = finish - start;
        timeArray[3] = timeConsumedMillis;
        System.out.println("QuickSort " + Arrays.toString(arrayQuickSort));
        System.out.println("time " + timeConsumedMillis);

        int[] arrayMergeSort = getArray();
        System.out.println(Arrays.toString(arrayMergeSort));
        start = System.nanoTime();
        getMergeSort(arrayMergeSort, 0, arrayMergeSort.length - 1);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        timeArray[4] = timeConsumedMillis;
        System.out.println("mergeSort " + Arrays.toString(arrayQuickSort));
        System.out.println("time " + timeConsumedMillis);


        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 1; i < timeArray.length; i++) {
            if (timeArray[i] > timeArray[indexOfMax]) {
                indexOfMax = i;
            } else if (timeArray[i] < timeArray[indexOfMin]) {
                indexOfMin = i;
            }
        }
        System.out.println("Max-  " + methodNames[indexOfMax] + ", time - " + timeArray[indexOfMax] + ". Min -"
                + methodNames[indexOfMin] + ", time - " + timeArray[indexOfMin]);
    }


}
