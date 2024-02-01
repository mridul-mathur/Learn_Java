package Notes.Sorting;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 2, 4};
        System.out.println(findDuplicate(nums));
    }

    private static int findDuplicate(int[] nums) {
        int i = 1;
        while (i < nums.length) {
            int index = nums[i] - 1;
            if (nums[i] != nums[index]) {
                swap(nums, i, index);
            } else {
                i++;
            }
        }
        return nums[nums.length - 1];
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
