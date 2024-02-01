package Leetcode.Recursion;

public class Power2 {
    public static void main(String[] args) {
        int n = 256;
        boolean b = isPowerOfTwo(n);
        System.out.println(b);
    }

    private static boolean isPowerOfTwo(int n) {
        if (n == 1 || n == 2) {
            return true;
        } else {
            if (n % 2 == 0 && n > 0) {
                return isPowerOfTwo(n / 2);
            } else return false;
        }
    }
}
