package Notes.Sorting;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int missing = missingNumber(nums);
        System.out.println(missing);
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < nums.length && nums[i] != nums[nums[i]]) {
                swap(nums, i, nums[i]);
            } else {
                i++;
            }
        }
        i = 0;
        while (i < nums.length) {
            if (nums[i] != i) {
                return i;
            }
            i++;
        }
        return nums.length;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
