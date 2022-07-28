package com.str;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChars {
    public static void main(String[] args) {
        String s = "LonsgestsSubstringFindout";
        Map<Character, Integer> visited = new HashMap<>();
        String output = "";
        for (int start = 0, end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            if (visited.containsKey(currentChar)) {
                start = Math.max(visited.get(currentChar) + 1, start);
            }
            if (output.length() < end - start + 1) {
                output = s.substring(start, end + 1);
            }
            visited.put(currentChar, end);
        }
        System.out.println(output);
    }
}
