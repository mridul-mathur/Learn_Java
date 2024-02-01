package Notes.Sorting;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {2, 3, 2};
        System.out.println(Arrays.toString(findError(nums)));
    }

    private static int[] findError(int[] nums) {
        int[] ans = {-1, -1};
        int i = 0;
        while (i < nums.length) {
            int index = nums[i] - 1;
            if (nums[i] != nums[index]) {
                swap(nums, i, index);
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                ans[0] = nums[i];
                ans[1] = i + 1;
            }
        }
        return ans;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
