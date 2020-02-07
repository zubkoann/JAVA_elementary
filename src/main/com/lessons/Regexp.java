package com.lessons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regexp {
    public static void main(String[] args) {
        final String regex = "^(RM|B|IG|SE18|SE28|CV|SK|TW|CR|E14|E3|E1|E6|E7|E12|LE)[\\w\\d\\s]+";
        final String string = "RM1 1SS";
        boolean d =string.matches(regex);

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);
        System.out.println("boolean " + d);

//        if (matcher.find()) {
//            System.out.println("Full match: " + matcher.group(0));
//            for (int i = 1; i <= matcher.groupCount(); i++) {
//                System.out.println("Group " + i + ": " + matcher.group(i));
//            }
//        }
    }
}
