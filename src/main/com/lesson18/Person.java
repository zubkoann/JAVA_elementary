package com.lesson18;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 * 1) Написать класс Person, у которого если следующие поля:
 * - Фамилия, Имя, Отчество, дата рождения.
 * Написать конструкторы:
 * - на все поля,
 * - только на ФИО
 * - который принимает 1 параметр - строку с полным именем "Иванов Иван Иванович", и задает отдельные значения в поля Фамилия, Имя, Отчество.
 * <p>
 * Написать методы:
 * - который возвращает полное ФИО типа "Иванов Иван Иванович"
 * - краткое ФИО типа "Иванов И. И."
 * - который на основе даты рождения выводит количество полных лет.
 * <p>
 * 1.1*) Дата рождения задается как строка типа "18.12.1985"
 */
public class Person implements Cloneable{
    private String surname;
    private String name;
    private String middleName;
    private String dateBirth;

    public static void main(String[] args) {
        Person mick = new Person("ggggg tttt wwww");
        System.out.println(mick.toString());
        Person rick = new Person("rick", "hfghgdh", "dfgdfgdg", "12.09.2000");
        System.out.println(rick.toString());
        System.out.println(rick.getFullName());
        System.out.println(rick.getShortName());
        System.out.println(rick.getAge());

    }

    public String getFullName() {
//        String append = new StringBuilder().append(this.surname).append(" ").append(this.name).append(" ").append(this.middleName).toString();
        String fullName = String.join(" ", this.surname, this.name,  this.middleName);
        return fullName;
    }
    public int getAge(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate startDate = LocalDate.parse(this.dateBirth, formatter);
        LocalDate endDate = LocalDate.now();
        int age = Period.between(startDate, endDate).getYears();

        return age;
    }

    public String getShortName() {
        String name = Character.toString(this.name.charAt(1)).toUpperCase();
        String middleName = Character.toString(this.middleName.charAt(1)).toUpperCase();
        String shortName = String.join(" ", this.surname, name+".",  middleName+".");
        return shortName;
    }

    public Person(String fullName) {
        String[] arr = fullName.split("\\s");
        this.surname = arr[0];
        this.name = arr[1];
        this.middleName = arr[2];
    }

    public Person(String surname, String name, String middleName) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
    }

    public Person(String surname, String name, String middleName, String dateBirth) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.dateBirth = dateBirth;
    }

    public Person() {
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName()+getDateBirth());
    }

    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                '}';
    }


}
