package Leetcode.Two_Pointers;

import java.util.Arrays;

//75. Sort Colors
/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that
objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue,
respectively.

You must solve this problem without using the library's sort function.



Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]


Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.


Follow up: Could you come up with a one-pass algorithm using only constant extra space?
 */
public class SortColors {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void sortColors(int[] nums) {
        if (nums.length < 1) {
            return;
        }
        arrange0(nums);
        arrange2(nums);
    }

    private static void arrange2(int[] nums) {
        int e = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                return;
            } else if (nums[i] == 2) {
                swap(nums, i, e);
                e--;
            }
        }
    }

    private static void arrange0(int[] nums) {
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                swap(nums, s, i);
                s++;
            }
        }
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
