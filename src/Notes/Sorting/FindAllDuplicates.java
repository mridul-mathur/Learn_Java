package Notes.Sorting;

import java.util.ArrayList;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        ArrayList<Integer> list = allDuplicates(nums);
        System.out.println(list);
    }

    private static ArrayList<Integer> allDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 1;
        while (i < nums.length) {
            int index = nums[i] - 1;
            if (nums[i] != nums[index]) {
                swap(nums, i, index);
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                list.add(nums[j]);
            }
        }
        return list;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}