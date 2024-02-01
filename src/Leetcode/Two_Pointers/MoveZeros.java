package Leetcode.Two_Pointers;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int[] zero = moveZeroes(arr);
        System.out.println(Arrays.toString(zero));
    }

    public static int[] moveZeroes(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            System.out.println(i);
            System.out.println(j);
            int num = nums[j];
            if (num != 0) {
                nums[i] = num;
                i++;
            }
        }
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
        return nums;
    }
}
