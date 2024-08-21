package Notes.Recursion.SortingRec;

import java.util.Arrays;

public class BubbleRec {
    public static void main(String[] args) {
        int[] arr = {21, 32, 14, 43, 1, 243, 7};
        int l = arr.length - 1;
        int start = 0;
        bubble(arr, l, start);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubble(int[] arr, int l, int s) {
        if (l == 0) {
        } else if (s < l) {
            if (arr[s] > arr[s + 1]) {
                swap(arr, s, s + 1);
            }
            bubble(arr, l, s + 1);
        } else {
            bubble(arr, l - 1, 0);
        }
    }

    private static void swap(int[] arr, int s, int i) {
        int temp = arr[s];
        arr[s] = arr[s + 1];
        arr[s + 1] = temp;
    }

}
