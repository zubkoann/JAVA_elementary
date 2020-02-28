package com.lessons;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Homework19 {
    private static String filename = "test.txt";
    private List<String> periodArraн = new ArrayList<>();

    public static void main(String[] args) {
        int days = getSummDays(filename);
        int daysToDepature = 90 + days;
        String text = (daysToDepature > 0) ? "Осталось " + daysToDepature : "Просрочен на " + Math.abs(daysToDepature);
        System.out.println(text);
        System.out.println(days);
    }

    public static int getSummDays(String filename) {
        int countDays = 0;
        File file = new File(filename);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split("-");
                int days = getDiffDateByPeriod(arr);
                countDays += days;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return countDays;
    }

    public static int getDiffDateByPeriod(String[] period) {
        int diffDays = 0;
        if (period.length == 0) return diffDays;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try {
            LocalDate halfYearAgo = LocalDate.now().minusDays(180);
            LocalDate startDate = LocalDate.parse(period[0].trim(), formatter);
            int dif = Period.between(halfYearAgo, startDate).getMonths();
            System.out.println("dif"+dif + " half year" + halfYearAgo + " sartDate " + startDate);
            startDate = (dif < 0) ? halfYearAgo : startDate;
            LocalDate endDate = (period.length < 2) ? LocalDate.now() : LocalDate.parse(period[1].trim(), formatter);
            diffDays = Period.between(startDate, endDate).getDays();
        } catch (DateTimeParseException e) {
            System.out.println("Дата в нечитаемом формате " + e.getParsedString());
        } catch (Exception e) {
            System.out.println(e);
        }

        return diffDays;
    }
}
