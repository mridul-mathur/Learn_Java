package Notes.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //comparision sort method
        //AKA Sinking sort or Exchange sort
        int[] nums = {3, 2, 1, 9, 8, 7};
        bubblesort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void bubblesort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}