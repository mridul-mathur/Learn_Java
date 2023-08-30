package Notes.Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] nums = {6, 5, 4, 3, 2, 1};
        quicksort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void quicksort(int[] nums) {
        int i = 1;
        while (i < nums.length) {
            int index = nums[i] - 1;
            if (nums[i] != nums[index]) {
                swap(nums, i, index);
            }
            i++;
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
