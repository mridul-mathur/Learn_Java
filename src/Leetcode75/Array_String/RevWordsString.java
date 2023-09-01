package Leetcode75.Array_String;

public class RevWordsString {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String ans = reverseSentence(s);
        System.out.println(ans);
    }

    public static String reverseSentence(String s) {
        String[] str = s.trim().split(" +");
        String out = "";
        for (int i = str.length - 1; i > 0; i--) {
            out += str[i] + " ";
        }
        return out + str[0];
    }
}
