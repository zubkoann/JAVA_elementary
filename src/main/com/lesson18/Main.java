package com.lesson18;

import java.util.Objects;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Group myGroup = new Group("JAVA", "12.01.2020", 12, 2);
        Person zubko = new Person("Zubko Anna Alexandrovna");
        Person simon = new Person("Simon", "Albert", "Albertovich", "12.09.2000");
        myGroup.setGroupList(zubko);
        Group mygroup2 = myGroup.clone();
        mygroup2.setCourseName("lkjlkj");
        mygroup2.setLessonsSum(14);
        mygroup2.setStartDate("30.01.2020");
        mygroup2.setGroupList(simon);
        mygroup2.setGroupList(zubko);
        mygroup2.setGroupList(simon);
        myGroup.getGroupList();
        mygroup2.getGroupList();
        System.out.println("myGroup "+myGroup);
        System.out.println("myGroup2 "+mygroup2);
//        System.out.println("myGroup2get "+mygroup2.getCourseName());
//        System.out.println("myGroupget "+myGroup.getCourseName());


        Person geck = new Person("Geck tttt wwww");
        Person rain = new Person("Rain", "hfghgdh", "dfgdfgdg", "12.09.2000");
        Person fack = geck.clone();
        fack.setSurname("Brit");
        fack.setMiddleName("Alehandro");
        System.out.println(fack);
        System.out.println(geck);
    }
}

