package com.str;

public class ReverseString {
	public static void main(String[] args) {
		//input 
		String str="Anil";
		String revStr=reverseString3(str);
		System.out.println("Reverse String is "+revStr);
	}
	
	//One method-->using for loop
	private static String reverseString1(String str) {
		if(str==null ||str.isEmpty())
			return str;
		String revStr="";
		char strArr[]=str.toCharArray();
		for(int i=strArr.length-1;i>=0;i--) {
			revStr+=strArr[i];
		}
		return revStr;
	}
	//Second method-->StringBuffer
	private static String reverseString2(String str) {
		if(str==null ||str.isEmpty())
			return str;
		StringBuffer sb=new StringBuffer(str);
		return sb.reverse().toString();
	}
	
	//Thired method-->Recurssive
	private static String reverseString3(String str) {
		if(str==null ||str.isEmpty())
			return str;
		return str.charAt(str.length()-1)+reverseString3(str.substring(0, str.length()-1))	;
	}
	
}
