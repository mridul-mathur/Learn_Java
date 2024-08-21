package CRT;

import java.util.Arrays;

public class NextLargest {
    public static void main(String[] args) {
        int[] arr1 = {3, 1, 4, 2, 6, 5};
        nextlarger(arr1);
    }

    private static void nextlarger(int[] arr) {
        int[] sol_arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sol_arr[i] = find_min(arr, i);
        }
        System.out.println("NextLarger Array: " + Arrays.toString(sol_arr));
    }

    private static int find_min(int[] arr, int ele) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > arr[ele] && arr[i] < min) {
                min = arr[i];
            }
            i++;
        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }
}
