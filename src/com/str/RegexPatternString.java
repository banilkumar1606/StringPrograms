package com.str;

public class RegexPatternString {
    public static void main(String[] args) {
        String input = "8965134";
       // String regex = "[0-9]+";
        String regex = "[\\d]+";
        System.out.println(input.matches(regex));
    }
}
