package com.str;

import java.util.HashMap;
import java.util.Map;

public class StringWordCount {
	public static void main(String[] args) {
		String str="my     name is ranga     my hobbies are name";
		String strArr[]=str.replaceAll(" +", " ").split(" ");
		Map<String, Integer> hashMap=new HashMap<>();
		for(int i=0;i<strArr.length;i++) {
			if(hashMap.containsKey(strArr[i])) {
				hashMap.put(strArr[i], hashMap.get(strArr[i])+1);
			}
			else
				hashMap.put(strArr[i], 1);
		}
		hashMap.entrySet().forEach(m->System.out.println(m.getKey()+"-->"+m.getValue()));
		
		/*Output:
		 * hobbies-->1 
		 * are-->1 
		 * name-->2 
		 * is-->1 
		 * my-->2 
		 * ranga-->1
		 *  
		 */
		
	}
}
