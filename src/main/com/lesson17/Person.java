package com.lesson17;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Person {
    public static final Random rand = new Random();

    public static void main(String[] args) {
        /**
         3. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
         Создать один или несколько конструкторов которые гарантирует что у каждого есть имя, фамилия.
         Создать list из 100 обьектов типа Person заполненных случайными данными (Например создать массив на несколько имен и выбирать из него случайным образом).
         3.1*. Обеспечить чтобы случайные данные (вес, рост, возраст) выглядели правдоподобно:
         не было человека весом 3 кг и ростом 180 итд.
         */
        String[] nameArray = {"Andrey", "Yura", "Vlad", "Artem"};
        String[] surnameArray = {"Sidorov", "Petov", "Ivanov", "Zubko", "Sultan"};
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int age = rand.nextInt(81) + 20;
            double height = rand.nextDouble() * 2;
            while (height < 1.4) {
                height = rand.nextDouble() * 2;
            }
            height = Math.round(height * 100.0) / 100.0;
            int weight = (int) (height * 100 - 130 + rand.nextInt(51));

            persons.add(new Person(nameArray[rand.nextInt(nameArray.length)], surnameArray[rand.nextInt(surnameArray.length)], age, weight, height));
        }
        for (Person p : persons) {
            System.out.println(p.toString());
        }
    }

    private String name;
    private String surname;
    private int age;
    private int weight;
    private double height;

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age='" + age + '\'' +
                ", weidht='" + weight + "kg" + '\'' +
                ", heidht='" + height + '\'' +
                '}';
    }

    public Person(String name, String surname, int age, int weight, double height) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
