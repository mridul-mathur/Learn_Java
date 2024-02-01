package Leetcode.Array_String;

import java.util.Arrays;

//1480. Running Sum of 1d Array
public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum1(nums)));//recursion
        nums = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum2(nums)));//iteration
    }

    private static int[] runningSum2(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    private static int[] runningSum1(int[] nums) {
        int sum = nums[0];
        sol(nums, sum, 1);
        return nums;
    }

    private static void sol(int[] nums, int sum, int i) {
        if (i < nums.length) {
            sum += nums[i];
            sol(nums, sum, i + 1);
            nums[i] = sum;
        }
    }
}
