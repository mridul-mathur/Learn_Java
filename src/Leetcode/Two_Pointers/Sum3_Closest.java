package Leetcode.Two_Pointers;

import java.util.Arrays;

public class Sum3_Closest {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }

    private static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        if (nums.length == 3) {
            return nums[0] + nums[1] + nums[2];
        }
        int s = 1;
        int e = nums.length-1;
        int min = Integer.MAX_VALUE;
        int ans = 0;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid + 1] + nums[mid] + nums[mid - 1] > target) {
                e = mid - 1;
                if (nums[mid + 1] + nums[mid] + nums[mid - 1] - target < min) {
                    ans = mid;
                }
            } else if (nums[mid + 1] + nums[mid] + nums[mid - 1] < target) {
                s = mid + 1;
                if (target - nums[mid + 1] + nums[mid] + nums[mid - 1] < min) {
                    ans = mid;
                }
            } else {
                return target;
            }

        }
        return nums[ans + 1] + nums[ans] + nums[ans - 1];
    }
}
