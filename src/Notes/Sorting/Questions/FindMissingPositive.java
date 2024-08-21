package Notes.Sorting.Questions;

public class FindMissingPositive {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0};
        System.out.println(firstMissingPositive(nums));
    }

    private static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int index = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[index]) {
                swap(nums, i, index);
            } else {
                i++;
            }
        }
        i = 1;
        while (i <= nums.length) {
            if (nums[i - 1] != i) {
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
