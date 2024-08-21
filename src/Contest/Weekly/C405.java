package Contest.Weekly;

import java.util.ArrayList;
import java.util.List;

public class C405 {
    public static void main(String[] args) {
        String s = "dart";
        int k = 3;
        System.out.println(getEncryptedString(s, k));
        int n = 3;
        System.out.println(validStrings(n));
        char[][] grid = {{'X', 'Y', '.'}, {'Y', '.', '.'}};
        System.out.println(numberOfSubmatrices(grid));
    }

    private static String getEncryptedString(String s, int k) {
        int n = s.length();
        StringBuilder str = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            int ch = (i + k) % n;
            str.append(s.charAt(ch));
        }
        return str.toString();
    }

    private static List<String> validStrings(int n) {
        List<String> strlist = new ArrayList<>();
        String end0 = "0";
        String end1 = "1";
        count(n, end0, strlist);
        count(n, end1, strlist);
        return strlist;
    }

    private static void count(int n, String str, List strlist) {
        if (n == 1) {
            strlist.add(str);
            return;
        }
        if (str.endsWith("1")) {
            String str1 = str;
            str1 += "1";
            String str2 = str;
            str2 += "0";
            count(n - 1, str1, strlist);
            count(n - 1, str2, strlist);
        }
        if (str.endsWith("0")) {
            String str3 = str;
            str3 += "1";
            count(n - 1, str3, strlist);
        }
    }

    private static int numberOfSubmatrices(char[][] grid) {
        int count = 0;
        int numx = 0;
        int numy = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 'X') {
                    numx += 1;
                } else if (grid[i][j] == 'Y') {
                    numy += 1;
                }
                if (numx == numy && numx != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
