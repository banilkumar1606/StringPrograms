package com.str;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PossibleNameChanges {
    public static void main(String[] args) {
        System.out.println(possibleChanges(Arrays.asList("dfg")));
    }
    private static List<String> possibleChanges(List<String> usernames) {
        List<String> result = new ArrayList<>();
        usernames.stream()
                .forEach(word->{
                    boolean swap = false;
                    for(int i=0;i<word.length()-1;i++){
                        if(word.charAt(i)>word.charAt(i+1)){
                            swap = true;
                            break;
                        }
                    }
                    if(swap)
                        result.add("YES");
                    else
                        result.add("NO");
                });


        return result;

    }
}
