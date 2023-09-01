package Leetcode75.Array_String;

import java.util.Scanner;

public class GCD_Strings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        String gcd = GCD_String(str1, str2);
        System.out.println(gcd);
    }

    private static String GCD_String(String str1, String str2) {
        StringBuilder gcd = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            for (int j = 0; j < str2.length(); j++) {
                if (ch == str2.charAt(j)) {
                    gcd.append(ch);
                }
            }
        }
        return gcd.toString();
    }
}
