package Notes.BubbleSorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //comparision sort method
        //AKA Sinking sort or Exchange sort
        int [] nums = {3,1,5,4,2};
        bubblesort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void bubblesort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < nums.length-i ; j++) {
                if (nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            } 
        }
    }
}