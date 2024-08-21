package Interview150.Array_String;

public class IndexOfFirstOccurrence {
    public static void main(String[] args) {
        String haystack = "aababsaaabaabaaaba";
        String needle = "aabaab";
        System.out.println(strStr(haystack, needle));
    }

    private static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int[] lps = new int[needle.length()];
        int prev = 0;
        int i = 1;
        while (i < needle.length()) {
            if (needle.charAt(i) == needle.charAt(prev)) {
                lps[i] = prev + 1;
                prev += 1;
                i += 1;
            } else if (prev == 0) {
                lps[i] = 0;
                i += 1;
            } else {
                prev = lps[prev - 1];
            }
        }
        i = 0;
        int j = 0;
        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                if (j == 0) {
                    i++;
                } else {
                    j = lps[j - 1];
                }
            }
            if (j == needle.length()) {
                return i - needle.length();
            }
        }
        return -1;
    }
}
