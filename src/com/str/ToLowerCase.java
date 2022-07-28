package com.str;

public class ToLowerCase {
    public static void main(String[] args) {
        String s = "HELLoz";
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if(65<= ch && ch<=90){
               ch = (char) (ch+32) ;
            }
            System.out.print(ch);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if(97<= ch && ch<=122){
                ch = (char) (ch-32) ;
            }
            System.out.print(ch);
        }
    }

}
