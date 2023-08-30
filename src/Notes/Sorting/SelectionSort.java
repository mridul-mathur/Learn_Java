package Notes.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] nums = {9,8,7,1,2,3};
        selectionsort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void selectionsort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length-i-1;
            int max = maxindex(nums , 0,last);
            swap(nums,last , max);
        }
    }
    public static int maxindex(int[]arr,int start, int end){
        int max =start;
        for (int i = 0; i <= end; i++) {
            if (arr[i] >= arr[max]){
                max = i;
            }
        }
        return max;
    }
    public static void swap(int [] nums ,int a , int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
