package Leetcode75.Array_String;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(productExcept(arr)));
    }

    public static int[] productExcept(int[] nums) {
        int[] prev = new int[nums.length];
        int[] next = new int[nums.length];
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
            prev[i] = product;
        }
        product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            product *= nums[i];
            next[i] = product;
        }
        nums[0] = next[1];
        nums[nums.length - 1] = prev[prev.length - 2];
        for (int i = 1; i <= nums.length - 2; i++) {
            nums[i] = prev[i - 1] * next[i + 1];
        }
        return nums;
    }
}
