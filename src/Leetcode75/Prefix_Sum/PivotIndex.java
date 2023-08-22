package Leetcode75.Prefix_Sum;

public class PivotIndex {
    public static void main(String[] args) {
        int[] arr = {2, 1, -1};
        System.out.println(pivotIndex(arr));
    }

    public static int pivotIndex(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
            if (leftSum == sum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
