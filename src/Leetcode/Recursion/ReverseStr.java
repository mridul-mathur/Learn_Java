package Leetcode.Recursion;

import java.util.Arrays;

public class ReverseStr {
    public static void main(String[] args) {
        char[]s = {'H','a','n','n','a','h'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
    public static void reverseString(char[] s) {

    }
    private static void swap(char[]s ,int a,int b){
        char temp = s[a];
        s[a] = s[b];
        s[b] = temp;
    }
}
