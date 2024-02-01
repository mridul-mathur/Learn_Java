package Notes.Bit_Manupulation;

import java.util.Arrays;

public class BitwiseOpr {
    public static void main(String[] args) {
        int[] a = {0, 0, 1, 1};
        int[] b = {0, 1, 0, 1};
        int[] and = andop(a, b);
        int[] or = orop(a, b);
        int[] xor = xorop(a, b);
        System.out.println("a : " + Arrays.toString(a));
        System.out.println("a : " + Arrays.toString(b));
        System.out.println("& : " + Arrays.toString(and));
        System.out.println("| : " + Arrays.toString(or));
        System.out.println("^ : " + Arrays.toString(xor));

    }

    private static int[] comp(int[] a) {
        int[] ans = new int[4];
        for (int i = 0; i < a.length; i++) {
            a[i] = (-1) * a[i];
        }
        return ans;
    }

    private static int[] xorop(int[] a, int[] b) {
        int[] ans = new int[4];
        for (int i = 0; i < a.length; i++) {
            if ((a[i] ^ b[i]) == 1) {
                ans[i] = 1;
            } else {
                ans[i] = 0;
            }
        }
        return ans;
    }

    private static int[] orop(int[] a, int[] b) {
        int[] ans = new int[4];
        for (int i = 0; i < a.length; i++) {
            if ((a[i] | b[i]) == 1) {
                ans[i] = 1;
            } else {
                ans[i] = 0;
            }
        }
        return ans;
    }

    private static int[] andop(int[] a, int[] b) {
        int[] ans = new int[4];
        for (int i = 0; i < a.length; i++) {
            if ((a[i] & b[i]) == 1) {//condition for and
                ans[i] = 1;
            } else {
                ans[i] = 0;
            }
        }
        return ans;
    }
}
