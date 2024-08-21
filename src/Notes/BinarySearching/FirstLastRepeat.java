package Notes.BinarySearching;

import java.util.Arrays;

public class FirstLastRepeat {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 8, 10};
        System.out.println(Arrays.toString(searchrange(arr, 8)));
    }

    private static int[] searchrange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = search(nums, target, true);
        ans[0] = start;
        if (ans[0] != -1) {
            int end = search(nums, target, false);
            ans[1] = end;
        }
        return ans;
    }

    private static int search(int[] nums, int target, boolean findstart) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        int i = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (findstart) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}

