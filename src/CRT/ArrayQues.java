package CRT;

import java.util.Arrays;

public class ArrayQues {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 4, 2, 0};
        System.out.println("Original Array: " + Arrays.toString(arr));
        revarr(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
        System.out.println("\n------------------\n");
        sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr) + "\nMin & Max: " + arr[0] + " & " + arr[arr.length - 1]);
        int[] arr1 = {1, 3, 5, 6, 4, 2, 0};
        System.out.println("\n------------------\n");
        System.out.println("Second Largest element: " + secondLargest(arr1));
    }

    private static void  revarr(int[] arr) {
        for (int i = 0; i < (arr.length - 1) / 2; i++) {
            swap(arr, i, arr.length - 1 - i);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    private static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    private static int secondLargest(int[] nums) {
        int second = Integer.MIN_VALUE;
        int max = 0;
        if (nums.length == 1) {
            return second;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                second = i;
            }
        }
        return second;
    }


}
