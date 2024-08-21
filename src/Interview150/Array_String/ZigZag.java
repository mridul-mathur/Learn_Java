package Interview150.Array_String;

//6. Zigzag Conversion

import java.util.Arrays;

/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like
this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);


Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A"


Constraints:

1 <= s.length <= 1000
s consists of English letters (lower-case and upper-case), ',' and '.'.
1 <= numRows <= 1000
 */
public class ZigZag {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        System.out.println(convertZigZag(s, numRows));
    }

    private static String convertZigZag(String s, int numRows) {
        StringBuilder str = new StringBuilder(s.length());
        int maxCol = ((s.length() / numRows) * 2) + 1;
        char[][] arr = new char[maxCol][numRows];
        int k = 0;
        int i = 0;
        int j = 0;
        while (k < s.length()) {
            while (j < numRows) {
                arr[i][j] = s.charAt(k);
                k++;
                j++;
                if (k >= s.length()) {
                    break;
                }
            }
            while (j > 0) {
                i++;
                j--;
                arr[i][j] = s.charAt(k);
                k++;
                if (k >= s.length()) {
                    break;
                }
            }
            j = 0;
        }
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        return str.toString();
    }
}
