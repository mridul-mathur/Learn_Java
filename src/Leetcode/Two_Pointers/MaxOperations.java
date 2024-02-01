package Leetcode.Two_Pointers;

import java.util.Arrays;

public class MaxOperations {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 5;
        int count = maxOperations(arr, k);
        System.out.println(count);
    }

    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        int count = 0;
        while (i < j) {
            if (nums[i] + nums[j] == k) {
                i++;
                j--;
                count++;
            } else if (nums[i] + nums[j] > k) {
                j--;
            } else {
                i++;
            }
        }
        return count;
    }
}
