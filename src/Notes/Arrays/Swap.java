package Notes.Arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        //swapping 2 elements of an array

        int arr[] = {12, 23, 34, 45, 56, 67, 78, 89};
        swap(arr, 1, 5);
        swap(arr, 4, 7);
    }

    static void swap(int arr[], int i, int j) {
        System.out.println("Before Swap : " + Arrays.toString(arr));
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        System.out.println("After Swap : " + Arrays.toString(arr));
    }
}
