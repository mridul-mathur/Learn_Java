package Notes.Sorting;

import java.util.Arrays;

public class InPlaceMerge {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 9, 7, 8, 4, 3, 6};
        inplacemerge(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void inplacemerge(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }
        int mid = (s + e) / 2;
        inplacemerge(arr, s, mid);
        inplacemerge(arr, mid, e);

        merge(arr, s, mid, e);
    }

    private static void merge(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        System.arraycopy(mix, 0, arr, s, mix.length);
    }
}
