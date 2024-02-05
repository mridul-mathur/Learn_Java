package Leetcode.Array_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1389. Create Target Array in the Given Order

public class TargetArray {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    private static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        int[] target = new int[nums.length];
        for (int i = 0; i <= nums.length - 1; i++) {
            list.add(index[i], nums[i]);
        }
        int j = 0;
        for (int a : list) {
            target[j++] = a;
        }
        return target;
    }
}
