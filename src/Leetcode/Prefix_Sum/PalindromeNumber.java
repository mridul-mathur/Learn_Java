package Leetcode.Prefix_Sum;

public class PalindromeNumber {


    public static void main(String[] args) {
        int x = 11211;
        System.out.println(isPalindrome(x));
    }

    private static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int rev = 0;
        int temp = x;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev == x;
    }
}
