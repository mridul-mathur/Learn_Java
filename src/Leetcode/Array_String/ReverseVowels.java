package Leetcode.Array_String;

public class ReverseVowels {
    public static void main(String[] args) {
        String s = "Leetcode";
        System.out.println(reverseVowel(s));

    }

    public static String reverseVowel(String str) {
        StringBuilder rev = new StringBuilder();
        StringBuilder vowel = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel.append(ch);
            }
            i++;
        }
        i = 0;
        int j = vowel.length() - 1;
        while (i < str.length()) {
            char ch = str.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                rev.append(vowel.charAt(j));
                j--;
            } else {
                rev.append(ch);
            }
            i++;
        }
        return rev.toString();
    }
}
