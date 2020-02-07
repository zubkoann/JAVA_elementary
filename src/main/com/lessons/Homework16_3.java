package com.lessons;

import java.io.*;
import java.util.Arrays;

public class Homework16_3 {
    public static void main(String[] args) {
        String[][] studentsArray = {
                {"Иванов О.", "4"},
                {"Петров И.", "3"},
                {"Дмитриев Н.", "2"},
                {"Смирнова О.", "4"},
                {"Керченских В.", "5"},
                {"Керченских В.", "5"},
                {"Котов Д.", "2"},
                {"Бирюкова Н.", "1"},
                {"Данилов П.", "3"},
                {"Аранских В.", "5"},
                {"Лемонов Ю.", "2"},
                {"Олегова К.  ", "4"}
        };
        String filename = "studentsList.txt";
        writeFile(studentsArray, filename);
        String[] fileArray = getStudentsArray(filename, studentsArray);
        getAverageRate(fileArray);
        writeFileBadStudents(fileArray);
    }

    /**
     * 3*) В текстовый файл построчно записаны фамилия и имя учащихся класса и его оценка.
     * a) Вывести средний балл по классу.
     * b) Записать в другой файл всех чья оценка меньше 3 баллов.
     */
    public static void writeFile(String[][] studentsArray, String filename) {
        File file = new File(filename);

        try (BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < studentsArray.length; i++) {
                bufferWriter.write(studentsArray[i][0] + " " + studentsArray[i][1] + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[] getStudentsArray(String filename, String[][] studentsArray) {
        int count = 0;
        File file = new File(filename);
        String[] rateArray = new String[studentsArray.length];

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                rateArray[count] = line;
                count++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return rateArray;
    }

    public static double getAverageRate(String[] studentsArray) {
        int sum = 0;

        for (String student : studentsArray) {
            String[] temp = student.trim().split("\\s+");
            sum += Integer.parseInt(temp[temp.length - 1]);
        }
        double average = sum / studentsArray.length;
        System.out.println(average);
        return average;
    }

    public static void writeFileBadStudents(String[] studentsArray) {
        File file = new File("badStudentsList.txt");
        try (BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < studentsArray.length; i++) {
                String[] temp = studentsArray[i].trim().split("\\s+");
                if (Integer.parseInt(temp[temp.length - 1]) <= 3) {
                    for (int j = 0; j < temp.length; j++) {
                        bufferWriter.write(temp[j] + " ");
                    }
                    bufferWriter.write("\n");
                }
                ;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
