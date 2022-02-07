package com.str;

import java.util.Arrays;

public class Angram {
	public static void main(String[] args) {
		String str="Anil";
		String str1="nial";
		boolean isAngram = isAngram1(str, str1);
		if(isAngram) 
			System.out.println("Two given Strings are angram each other");
		else
			System.out.println("Two given Strings are not angram each other");
		
	}
	
	//Method1: using sorting
	static boolean isAngram(String str, String str1) {
		char ch1[] = str.toCharArray();
		char ch2[] = str1.toCharArray();
		int n1 = ch1.length;
		int n2 = ch2.length;
		if(n1 != n2) 
			return false;
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int i=0;i<n1;i++) {
			if(ch1[i] != ch2[i])
				return false;
		}
		return true;
	}
	
	//Method2 : Using count
	static boolean isAngram1(String str, String str1) {
		if(str.length()!=str1.length())
			return false;
		int count = 0;
		for(int i=0;i<str.length();i++) {
			count = count + str.charAt(i);
		}
		for(int i=0;i<str1.length();i++) {
			count = count - str1.charAt(i);
		}
		if(count == 0)
			return true;
		return false;
	}
}
