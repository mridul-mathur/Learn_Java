package Notes.BinarySearching;

public class RotationCount {
    public static void main(String[] args) {
        int[] nums = {15, 18, 2, 3, 6, 12};
        System.out.println(count(nums));
    }

    private static int count(int[] nums) {
        int max = 0;
        if (nums.length <= 1) {
            return max;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= nums[max]) {
                max = i;
                if (nums[max] > nums[max + 1]) {
                    break;
                }
            }
        }
        return max + 1;
    }
}
