package Notes.BinarySearching;

public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4, 3, 1, 0};
        int pi = peakIndexInMountainArray(arr);
        System.out.println("Peak Index: " + pi);
        System.out.println("Peak: " + arr[pi]);
    }

    private static int peakIndexInMountainArray(int[] arr) {
        if (arr.length < 3) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
