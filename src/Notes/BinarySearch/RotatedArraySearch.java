package Notes.BinarySearch;

public class RotatedArraySearch {
    public static void main(String[] args) {
        int nums[] = {1,3};
        int target = 3;
        System.out.println(BinarySearchInRotatedArr(nums, target));
    }

    private static int BinarySearchInRotatedArr(int[] nums, int target) {
        int pivot = pivot(nums);
        int start =0;
        int end = pivot;
        if (target < nums[0]) {
            start = pivot + 1;
            end = nums.length - 1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private static int pivot(int[] nums) {
        int max =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= nums[max] ){
                max=i ;
                if (nums[max] > nums[max+1]){
                    break;
                }
            }
        }
        return max;
    }
}
