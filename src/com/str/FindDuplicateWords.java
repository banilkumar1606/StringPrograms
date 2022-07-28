package com.str;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateWords {
    public static void main(String[] args) {
        //Method 1:
        String string = "Hi Anil How are you Anil you";
        String lowercaseString = string.toLowerCase();
        int count;
        String words[] = lowercaseString.split(" ");
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }
            if (count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }

        //Method 2: using collection frequency
        List<String> listOfWords = Arrays.asList(string.toLowerCase().split(" "));
        Set<String> uniqueWords = new HashSet<>(listOfWords);
        for(String word : uniqueWords){
            if(Collections.frequency(listOfWords, word) >1)
                System.out.println(" "+word+" ");
        }
    }
}
