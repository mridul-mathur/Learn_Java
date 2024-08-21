package Leetcode.Recursion;

public class BinarySearchRec {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        System.out.println(search(nums, target));
    }

    private static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int search = BSRecursion(nums, target, start, end);
        return search;
    }

    private static int BSRecursion(int[] nums, int target, int start, int end) {
        int mid = start + ((end - start) / 2);
        if (start > end) {
            return -1;
        } else if (target == nums[mid]) {
            return mid;
        } else if (nums[mid] < target) {
            return BSRecursion(nums, target, mid + 1, end);
        } else {
            return BSRecursion(nums, target, start, mid - 1);
        }
    }
}
