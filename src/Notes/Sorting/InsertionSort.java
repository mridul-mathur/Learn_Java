package Notes.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 3};
        insertionsort(nums);
    }

    private static void insertionsort(int[] nums) {
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            while (j >= 1) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1);
                } else {
                    break;
                }
                j--;
            }
        }
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
        System.out.println(Arrays.toString(nums));
    }
}
