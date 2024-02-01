package Notes.Sorting;

import java.util.ArrayList;

public class AllMissingNumbers {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        ArrayList<Integer> list = missingNumbers(nums);
        System.out.println(list);
    }

    private static ArrayList<Integer> missingNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int index = nums[i] - 1;
            if (nums[i] != nums[index]) {
                swap(nums, i, index);
            } else {
                i++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                list.add(i + 1);
            }
            i++;
        }
        return list;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
