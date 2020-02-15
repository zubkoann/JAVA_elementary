package com.lesson17;

import java.util.Arrays;

public class MyList {

    /**
     1) Реализовать методы add(int value), get, set, toString
     2*) Реализовать остальные методы из примера выше и сделать сортировку вставками для MyList
     */

    public static void main(String[] args) {
        MyList arr = new MyList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(arr);
        System.out.println("get-" + arr.get(1));
        arr.add(4);
        arr.add(5);
        arr.set(1, 22);
        System.out.println("set" + arr);
        arr.add(2, 2222);
        arr.remove(0);
        arr.removeByValue(5555);
        arr.getSortedArr();
        System.out.println(arr);
    }



    private int[] arr = new int[0];

    public void add(int value) {
        int[] tmp = new int[arr.length + 1];
        System.arraycopy(arr, 0, tmp, 0, arr.length);
        tmp[tmp.length - 1] = value;
        arr = tmp;
    }
    public int get(int index) {
        return arr[index];
    }

    public void set(int index, int value) {
        arr[index] = value;
    }


    public void add(int index, int value) {
        int[] tmp = new int[arr.length];
        tmp[index]=value;
        int[] tmpStart = new int[index];
        int[] tmpEnd = new int[arr.length-index-1];
        System.arraycopy(arr, 0, tmp, 0, tmpStart.length);
        System.arraycopy(arr, index+1, tmp, index+1, tmpEnd.length);
        System.out.println(Arrays.toString(tmp)+"add");
        arr = tmp;

    }

    public void remove(int index) {
        int[] tmp = new int[arr.length-1];
        int[] tmpStart = new int[index];
        int[] tmpEnd = new int[arr.length-index-1];
        System.arraycopy(arr, 0, tmp, 0, tmpStart.length);
        System.arraycopy(arr, index+1, tmp, index, tmpEnd.length);
        System.out.println(Arrays.toString(tmp)+"remove-"+index);
        arr = tmp;
    }

    public void removeByValue(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                remove(i);
                break;
            }
        }
        System.out.println(Arrays.toString(arr)+"NOremove-");
    }
    
    public void getSortedArr() {
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}