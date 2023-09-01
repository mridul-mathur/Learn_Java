package Leetcode75.Array_String;

import java.util.Scanner;

public class Merge_Strings_Alternately {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word1 = in.next();
        String word2 = in.next();
        String merge = mergestr(word1, word2);
        System.out.println(merge);
    }

    public static String mergestr(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int len = word1.length() + word2.length();
        for (int i = 0; i < len; i++) {
            if (i < word1.length()) {
                merged.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                merged.append(word2.charAt(i));
            }
        }
        return merged.toString();
    }
}
