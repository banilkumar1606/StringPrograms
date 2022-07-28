package com.str;

public class AnagramMinimumCharsRemove {
    public static void main(String[] args) {
        String s = "bbaaab";
        System.out.println(angramCheck(s));
    }

    private static int angramCheck(String s) {
        int len = s.length();
        int count = 0;
        if (s.length() % 2 != 0) return -1;
        String s1 = s.substring(0, len / 2);
        String s2 = s.substring(len / 2, len);
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int index = s2.indexOf(ch);
            if (index == -1) count++;
            else s2 = s2.substring(0, index) + s2.substring(index + 1);
        }
        return count;
    }

}
