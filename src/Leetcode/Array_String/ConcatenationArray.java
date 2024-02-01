package Leetcode.Array_String;

import java.util.Arrays;

//1929. Concatenation of Array
public class ConcatenationArray {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 1};
        System.out.println(Arrays.toString(getConcatenation1(nums)));
        System.out.println(Arrays.toString(getConcatenation2(nums)));
    }

    private static int[] getConcatenation2(int[] nums) {
        int len = nums.length;
        int[] ans = new int[2 * len];
        sol(nums, len, 0, ans);
        return ans;
    }

    private static void sol(int[] nums, int len, int i, int[] ans) {
        if (i < len) {
            int x = nums[i];
            sol(nums, len, i + 1, ans);
            ans[i] = x;
            ans[i + len] = x;
        }
    }

    private static int[] getConcatenation1(int[] nums) {
        int length = nums.length;
        int[] ans = new int[2 * length];
        for (int i = 0; i < length; i++) {
            ans[i] = nums[i];
            ans[i + length] = nums[i];
        }
        return ans;
    }
}
