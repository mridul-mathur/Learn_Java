package Leetcode.Array_String;

import java.util.Arrays;

//1365. How Many Numbers Are Smaller Than the Current Number
public class SmallerNumbers {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    private static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }
}
