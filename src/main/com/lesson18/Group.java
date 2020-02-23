package com.lesson18;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * 2) Написать класс "Группа", для отображения учебной группы в Hillel, который содержит поля:
 * - название курса
 * - дата старта занятий
 * - суммарное количество занятий курса
 * - количество занятий в неделю
 * - список учащихся типа Person
 * <p>
 * Написать методы:
 * - метод который печатает название группы на основе даты старта и названия курса, например: "Java21.12"
 * - печатает нумерованный список студентов, например:
 * Иванов
 * Петров
 * Сидоров
 * - добавить студента
 * <p>
 * 2.1*)
 * - метод который выдает дату старта последней недели курса
 * - удалить студента по фамилии или по номеру
 * - узнать если ли студент с такой фамилией в группе
 */

public class Group implements Cloneable {
    private String courseName;
    private String startDate;
    private int lessonsSum;
    private int lessonsWeek;
    private ArrayList<Person> groupList = new ArrayList<>();

    public static void main(String[] args) {
//        Group myGroup = new Group("JAVA", "12.01.2020", 12, 2);
//        Person mick = new Person("Zubko Anna Alexandrovna");
//        Person rick = new Person("Simon", "Albert", "Albertovich", "12.09.2000");
//        groupList.add(mick);
//        groupList.add(rick);
//        System.out.println(myGroup.getCourseName());
//        myGroup.getGroupList();
//        myGroup.addStudent(new Person("Ivanov", "Ivan", "Ivanovich", "22.05.1990"));
//        System.out.println(myGroup.checkStudentSurname("Ivanov"));
//        System.out.println(groupList);
//        myGroup.getLastWeekStart();
//        myGroup.deleteStudent(0);
//        myGroup.deleteStudent("Ivanov");
//        System.out.println(groupList);
    }

    public String getCourseName() {
        return String.join("", this.courseName, this.startDate);
    }

    public void deleteStudent(int i) {
        groupList.remove(i);
    }

    public void deleteStudent(String surname) {
        for (int i = 0; i < groupList.size(); i++) {
            if (groupList.get(i).getSurname().equalsIgnoreCase(surname)) {
                groupList.remove(i);
            }
        }
    }

    public void getLastWeekStart() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate startDate = LocalDate.parse(this.startDate, formatter);
        long weeks = lessonsSum / lessonsWeek;
        LocalDate lastWeekStart = startDate.plusWeeks(weeks - 1);
        System.out.println(lastWeekStart);

    }

    public void getGroupList() {
        groupList.forEach(person -> {
            System.out.println(person.getSurname());
        });
    }

    public void addStudent(Person student) {
        groupList.add(student);
    }

    public void setGroupList(Person person) {
        this.groupList.add(person);
    }

    public boolean checkStudentSurname(String checkSurname) {
        for (Person student : groupList) {
            if (student.getSurname().equalsIgnoreCase(checkSurname)) return true;
        }
        return false;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setLessonsWeek(int lessonsWeek) {
        this.lessonsWeek = lessonsWeek;
    }

    public void setLessonsSum(int lessonsSum) {
        this.lessonsSum = lessonsSum;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Group(String courseName, String startDate, int lessonsSum, int lessonsWeek) {
        this.courseName = courseName;
        this.startDate = startDate;
        this.lessonsSum = lessonsSum;
        this.lessonsWeek = lessonsWeek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(courseName, group.courseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCourseName());
    }

    @Override
    public Group clone() {
        try {
            Group copy = (Group) super.clone();
            copy.groupList = new ArrayList<>(groupList.size());
            for (Person list : groupList){
                copy.groupList.add((Person) list.clone());
            }

            return copy;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public String toString() {
        return "Group{" +
                "courseName='" + courseName + '\'' +
                ", startDate='" + startDate + '\'' +
                ", lessonsSum=" + lessonsSum +
                ", lessonsWeek=" + lessonsWeek +
                ", groupList=" + groupList +
                '}';
    }
}
