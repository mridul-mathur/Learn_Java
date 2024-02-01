package Leetcode.Array_String;

public class Triplets {
    public static void main(String[] args) {
        int[] arr = {20, 26, 10, 5, 13, 100};
        System.out.println(increasingTriplet(arr));
    }

    private static boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int left = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= left) {
                left = num;
            } else if (num <= mid) {
                mid = num;
            } else {
                return true;
            }
        }
        return false;
    }
}
