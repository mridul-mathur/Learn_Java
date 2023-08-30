package Notes.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] nums = {9,8,7,3,2,1};
        insertionsort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void insertionsort(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            int j = i+1;
            while (j>=1){
                if (nums[j]<nums[j-1]){
                    swap(nums,j,j-1);
                }else {
                    break;
                }
                j--;
            }
        }
    }
    public static void swap(int [] nums ,int a , int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
