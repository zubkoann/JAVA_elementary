package com.lessons;
import java.util.Scanner;

public class homework_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter speed of train 1");
        int speedTrain1 = s.nextInt();

        System.out.println("Enter speed of train 2");
        int speedTrain2 = s.nextInt();

        System.out.println("Enter distance ");
        int distance = s.nextInt();

        System.out.println("Enter checkPoint");
        int checkPoint = s.nextInt();

        double timeToCheckPointTrain1 = checkPoint/speedTrain1;

        double distanceTrain2 = timeToCheckPointTrain1*speedTrain2;

        if (distanceTrain2 + checkPoint>distance) {
            System.out.println("Trains will CRASH");
        } else{
            System.out.println("NO crash");
        }
    }
}
