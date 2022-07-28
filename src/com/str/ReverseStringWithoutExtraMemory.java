package com.str;

public class ReverseStringWithoutExtraMemory {

    public static void main(String[] args) {
        String s = "anil";
        System.out.println(reverseString(s.toCharArray()));
    }

    private static String reverseString(char arr[]) {
        int start = 0, end = arr.length-1;
        if (start < end) {
            arr[start] ^= arr[end];
            arr[end] ^= arr[start];
            arr[start] ^= arr[end];
            ++start;
            --end;

       }
        return String.valueOf(arr);
    }

}
