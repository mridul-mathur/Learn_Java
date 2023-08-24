package Notes.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        //Binary Search is used for sorted arrays,either ascending or descending.
        int[] arr = {-98, -76, -54, -32, -10, 0, 23, 45, 67, 89};
        /*
        for ascending array =>
        1. take the middle of the array,start of array and end of array.
        2. if the target element is greater than middle elemnt, then start == middle+1
        3. and now find the middle of the new start and end.
        4. if the target is smaller than middle, then end == middle-1
        5. and now find the middle of new end and start.
        6. if the target element is equal to middle element, then return middle.
        */
        System.out.println("Index of target: " + binarySearch(arr, 89));
    }

    public static int binarySearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
