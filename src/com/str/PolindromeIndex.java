package com.str;

public class PolindromeIndex {
    public static void main(String[] args) {
        String s = "abbaa";
        String rev = "";
        System.out.println(ispolindrome(s));


    }

    private  static int ispolindrome(String s) {
        int i,j,a,b;
        for ( i = 0, j = s.length() - 1; i <= j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                break;
            }
        }
        if (i > j) {
            return -1;
        }
        for (a = i + 1, b = j; a < j && b > i + 1; a++, b--) {
            if (s.charAt(a) != s.charAt(b)) {
                return j;
            }
        }
        return i;
    }

}
