package Leetcode.Condition_Loops;

/*
1281. Subtract the Product and Sum of Digits of an Integer

    Given an integer number n, return the difference between the product of its
    digits and the sum of its digits.

    Example 1:
        Input: n = 234
        Output: 15
        Explanation:
            Product of digits = 2 * 3 * 4 = 24
            Sum of digits = 2 + 3 + 4 = 9
        Result = 24 - 9 = 15

    Example 2:
        Input: n = 4421
        Output: 21
        Explanation:
            Product of digits = 4 * 4 * 2 * 1 = 32
            Sum of digits = 4 + 4 + 2 + 1 = 11
        Result = 32 - 11 = 21

    Constraints:
        1 <= n <= 10^5
 */
public class Product_Sum {
    static int s = 0;
    static int p = 1;

    public static void main(String[] args) {
        int n = 4421;
        System.out.println(subtractProductAndSum1(n));//using Recursion
        System.out.println(subtractProductAndSum2(n));//using iteration
    }

    private static int subtractProductAndSum2(int n) {
        int s = 0;
        int p = 1;
        while (n > 0) {
            int x = n%10;
            s += x;
            p *= x;
            n /=10;
        }
        int sub = p-s;
        return sub;
    }

    private static int subtractProductAndSum1(int n) {
        if (n == 0) {
            return 0;
        } else {
            int x = n % 10;
            s += x;
            p *= x;
            subtractProductAndSum1(n / 10);
            int sub = p - s;
            return sub;
        }
    }
}
