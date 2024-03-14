package Leetcode.Array_String;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,2,2};
        System.out.println(majorityElement(nums));
    }

    private static int majorityElement(int[] nums) {
        int count = 0;
        int cand = 0;
        for (int num : nums) {
            if (count == 0) {
                cand = num;
            }
            if (num == cand) {
                count++;
            } else {
                count--;
            }
        }
        return cand;
    }
}
