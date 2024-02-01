package Leetcode.Array_String;

import java.util.Arrays;


//1920. Build Array from Permutation
public class BuildArray {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(buildArray1(nums)));
        System.out.println(Arrays.toString(buildArray2(nums)));
    }

    private static int[] buildArray2(int[] nums) {
        sol(nums, 0);
        return nums;
    }

    private static void sol(int[] nums, int i) {
        if (i < nums.length) {
            int x = nums[nums[i]];
            sol(nums, i + 1);
            nums[i] = x;
        }
    }

    private static int[] buildArray1(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
