package Leetcode75.Sliding_Window;

public class FindMaxAverage {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }

    private static double findMaxAverage(int[] nums, int k) {
        int maxavg = 0;
        if (nums.length == 1 && k != 0) {
            return nums[0] / k;
        }
        double sum = 0;
        return maxavg;
    }
}