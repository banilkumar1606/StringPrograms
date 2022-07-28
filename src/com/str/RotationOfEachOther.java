package com.str;

public class RotationOfEachOther {
    public static void main(String[] args) {
        String s1 ="ABCD";
        String s2 = "CDAB";
        if(s1.length() == s2.length() && (s1+s1).indexOf(s2)!= -1){
            System.out.println("Rotational");
        }else{
            System.out.println("Not Rotational");
        }

    }
}
