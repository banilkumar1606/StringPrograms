package com.str;

import java.util.Stack;

public class ReverseAStringUsingStack {

    public static void main(String[] args) {
        String input ="anilk";

        Stack<Character> stack = new Stack<>();
        for(int i =0; i<input.length();i++){
            stack.push(input.charAt(i));
        }
        char[] output = new char[input.length()];
        for(int i=0;i<input.length();i++){
            output[i] =  stack.pop();
        }
        String str = new String(output);


        System.out.println(str);
    }

}
