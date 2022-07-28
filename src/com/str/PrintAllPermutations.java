package com.str;

public class PrintAllPermutations {

    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        permutate(str, 0, n - 1);
        generatePermutations(str, 0, str.length());

    }

    //Function for generating different permutations of the string
    static void generatePermutations(String str, int start, int end) {
        if (start == end - 1) {
            System.out.println(str);
        } else {
            for (int i = start; i < end; i++) {
                //swapping the string by fixing the character
                str = swap(str, start, i);
                //Recursively calling function generatePermutation() for rest of the characters
                generatePermutations(str, start + 1, end);
                //Backtracking and swapping the characters again
                str = swap(str, start, i);
            }
        }
    }

    /**
     * permutation function
     *
     * @param str string to calculate permutation for
     * @param l   starting index
     * @param r   end index
     */
    private static void permutate(String str, int l, int r) {
        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permutate(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    /**
     * Swap Characters at position
     *
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public static String swap(String a, int i, int j) {
        char[] charArray = a.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}

