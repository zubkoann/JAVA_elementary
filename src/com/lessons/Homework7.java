package com.lessons;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number;
        String matches="";
        System.out.println("Please enter number");
        number = s.nextInt();

        while (number>0 ){
            int k = number%10;
            number = number/10;
            int l = number%10;
            int number2 = number/10;

            while (l>0){
                if (k==l)  {
                    int count = 0;

                    for (int i=0; i<matches.length(); i++){
                        int d = Integer.parseInt(""+ matches.charAt(i));
                        if (d == l){
                            count++;
                            break;
                        }
                    }

                    if (count == 0) matches +=  l;
                    break;

                }else{
                    l = number2%10;
                    number2 = number2/10;
                }
            }
        }

        if (matches.length()>0)
            System.out.println("Tere is match at " + matches);
        else
            System.out.println("Tere is NO matches" + 0%10);
    }
}
