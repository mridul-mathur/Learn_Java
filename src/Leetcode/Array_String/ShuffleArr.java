package Leetcode.Array_String;

import java.util.Arrays;

//1470. Shuffle the Array
public class ShuffleArr {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = nums.length / 2;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    private static int[] shuffle(int[] nums, int n) {
        int[] a = Arrays.copyOfRange(nums, n, nums.length);
        int[] b = Arrays.copyOfRange(nums, 0, n);
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            nums[i] = b[j];
            nums[i + 1] = a[j];
            i += 2;
            j += 1;
        }
        return nums;
    }
}
