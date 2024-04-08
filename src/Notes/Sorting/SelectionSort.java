package Notes.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10, 9, 7, 5, 3, 1};
        selectionsort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void selectionsort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length - i - 1;
            int max = maxindex(nums, 0, last);
            swap(nums, last, max);
        }
    }

    private static int maxindex(int[] arr, int start, int end) {
        int max = start;
        for (int i = 0; i <= end; i++) {
            if (arr[i] >= arr[max]) {
                max = i;
            }
        }
        return max;
    }

    private static void swap(int[] nums, int a, int b) {
        if(nums[a]!=nums[b]) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
        }
    }
}
