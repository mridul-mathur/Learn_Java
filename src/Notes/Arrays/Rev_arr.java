package Notes.Arrays;

import java.util.Arrays;

public class Rev_arr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        rev(arr);
    }

    private static void rev(int[] arr) {
        System.out.println("initial arr : " + Arrays.toString(arr));
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        System.out.println("Reversed arr : " + Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
