package Notes.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        /*
        choose any element as pivot and after first pass all the elements less than the pivot
        will be on left side of the pivot and greater on right side of the pivot hence the
        pivot will be at it's correct positon.

        how to pick the pivot element?
            - pick corner
            - pick middle ✔ (Best time complexity)
            - pick random

        Quick sort is not a stable algorithm
        It is in-place sorting algorithm
        Merge Sort is better in linked list than Quick Sort cuz linked list is not a continuous
        memory allocation
         */

        int[] nums = {9, 8, 7, 3, 2, 1};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    private static void quickSort(int[] arr, int low, int hi) {
        if (low >= hi) {
            return;
        }

        int s = low;
        int e = hi;
        int mid = s + (e - s) / 2;
        int pivot = arr[mid];

        while (s <= e) {

            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                swap(arr, s, e);
                s++;
                e--;
            }
        }

        quickSort(arr, low, e);
        quickSort(arr, hi, s);
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
