package com.lessons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regexp {
    public static void main(String[] args) {
        final String regex = "([\\d\\.\\w]*\\.PL\\s*)$";
        final String string = "dfgdf.PL";
        boolean d =string.matches(regex);

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);
        System.out.println("boolean " + d);

        if (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
    }
}
