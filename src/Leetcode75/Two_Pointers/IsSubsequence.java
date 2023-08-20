package Leetcode75.Two_Pointers;

public class IsSubsequence {
    public static void main(String[] args) {
        String t = "ahbgdc";
        String s = "axc";
        boolean ans = isSubsequence(s, t);
        System.out.println(ans);
    }

    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        if (s.length() == 0) {
            return true;
        }
        while (i < t.length()) {
            if (t.charAt(i) == s.charAt(j)) {
                if (j == s.length() - 1) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
