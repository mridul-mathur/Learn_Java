package Interview150.Array_String;

import java.util.Arrays;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,1,2,3,3};
        int k = removeDuplicates2(nums);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));

        /* did't got it!!!!!! */
    }

    private static int removeDuplicates2(int[] nums) {
        if (nums.length<3){
            return nums.length;
        }
        int j =2;
        for (int i =2; i < nums.length; i++) {
            if (nums[i] != nums[j-2]){
                nums [j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
