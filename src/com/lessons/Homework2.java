package com.lessons;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter speed of train 1");
        int speedTrain1 = s.nextInt();

        System.out.println("Enter speed of train 2");
        int speedTrain2 = s.nextInt();

        System.out.println("Enter distance ");
        int distance = s.nextInt();

        System.out.println("Enter checkPoint");
        float checkPoint = s.nextInt();

        float timeToCheckPointTrain1 = checkPoint/speedTrain1;

        float distanceTrain2 = timeToCheckPointTrain1*speedTrain2;

        String answer =  (distanceTrain2 + checkPoint>distance) ? "Trains will CRASH" : "NO crash";
        System.out.println(answer);
    }
}
