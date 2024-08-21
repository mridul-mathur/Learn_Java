package Notes.Recursion.SortingRec;

import java.util.Arrays;

public class SelectionRec {
    public static void main(String[] args) {
        int[] arr = {21, 32, 14, 43, 1, 243, 7};
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] arr, int l, int s, int max) {
        if (l == 0) {
            return;
        }
        if (s < l) {
            if (arr[s] > arr[max]) {
                selection(arr, l, s + 1, s);
            } else {
                selection(arr, l, s + 1, max);
            }
        } else {
            swap(arr, max, l - 1);
            selection(arr, l - 1, 0, 0);
        }
    }

    private static void swap(int[] arr, int s, int l) {
        int temp = arr[s];
        arr[s] = arr[l];
        arr[l] = temp;
    }
}
