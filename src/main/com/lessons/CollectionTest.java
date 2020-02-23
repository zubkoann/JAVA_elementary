package com.lessons;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

import static java.lang.Math.PI;

public class CollectionTest {
    public static void main(String[] args) {
        List<Integer> arrList =new ArrayList<>();
        List<Integer> arrList2 =new ArrayList<>();
        arrList.add(4);
        arrList2.add(3);
        arrList.addAll(arrList2);
        System.out.println(arrList);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(Arrays.toString(arrList.toArray()));//[4, 3]

        arrList.forEach(number-> System.out.println(number));
        System.out.println("sublist" + numbers.subList(1,3));//sublist[2, 3]


        Map<Integer, Integer> numbers2Map = new HashMap<>();
        numbers2Map.put(1, 100);
        numbers2Map.put(2, 200);
        numbers2Map.put(3, 300);
        numbers2Map.forEach((k, v) -> {
            System.out.println("Key: " + k + " Value: " + v);
        });
        System.out.println(numbers2Map.containsKey(2));//true
        System.out.println(numbers2Map.containsValue(2));//false
        System.out.println(numbers2Map.entrySet());//[1=100, 2=200, 3=300]
        System.out.println(numbers2Map.get(1));//100
        System.out.println(numbers2Map.put(1,400));//100
        numbers2Map.putIfAbsent(5,400);
        System.out.println(numbers2Map.values());//[400, 200, 300, 400]
        System.out.println(numbers2Map.keySet());//[1, 2, 3, 5]
        System.out.println(numbers2Map.entrySet());//[1=400, 2=200, 3=300, 5=400]


        Set<Integer> myHashSet = new HashSet<Integer>();
        myHashSet.add(4);
        myHashSet.add(1);
        System.out.println(myHashSet);//[1, 4]

        System.out.println("-----------------------------------");

        BigDecimal g = new BigDecimal(1000/3.0); //3.333333333333333481363069950020872056484222412109375
        System.out.println(g);//3.333333333333333481363069950020872056484222412109375
        System.out.println((double)10/3.0); //3.3333333333333335
        System.out.println((float) 10/3.0); //3.3333333333333335
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);

        DecimalFormat df = new DecimalFormat(".##");
        System.out.println(Math.ceil(g.doubleValue()*100)/100);

        df.setRoundingMode(RoundingMode.CEILING);
        for (Number n : Arrays.asList(12, 123.12345, 0.23, 0.1, 2341234.212431324)) {
            Double d = n.doubleValue();
            System.out.println(df.format(d));
        }

        System.out.println(df.format(g.doubleValue()));
    }
}
