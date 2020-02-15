package com.lessons;

import java.util.*;

public class Lesson17 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(10); // для 10 элементов
        List<Integer> list2 = new ArrayList<>();
        List<String> list3 = new LinkedList<>();
        list2.add(11);
        list2.add(2);
        list2.add(1);
        method2(list2);


        list1.add("dddddd");
        list1.add("ffff");
        list1.add("hhhhh");
        list1.get(1);
        list1.set(0, "hhhfgddfsdfds");
        list1.remove(2);// удаляет по номеру
        list1.remove("hhhfgddfsdfds"); //удаляет по значению

        method(list1);

//        преобразовать в коллекцию
        Integer[] list4 = {2, 3, 4, 5, 5, 5, 5};
        List<Integer> list5 = Arrays.asList(list4); // преобразовать в List , на работу с примитивами не расчитаны
        List<Integer> list6 = new ArrayList<>(list2); // создает копию, не ссылка.

        //избавится от дубликата
        Set<Integer> set = new HashSet<>(list5);
        List<Integer> listCopy = new ArrayList<>((set));
        System.out.println("listCopy" + listCopy);

//        перебрать массив ArrayList
        for (int i = list6.size() - 1; i >= 0; i--) {
            if (list6.get(i) < 5) {
                list6.remove(i);
            }
        }
        System.out.println("list6" + list6);

//        System.arraycopy(arr,0,0, arr2); --самый быстрый способ скопировать массив


    }

    public static void method(List<String> list1) {

        System.out.println(list1);
    }

    public static void method2(List<Integer> list2) {
        Collections.sort(list2);

        System.out.println(list2);
    }
}
