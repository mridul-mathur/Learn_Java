package Notes.Recursion;

public class BinarySearchRec {
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 45, 56, 67, 78, 89};
        int start = 0;
        int end = arr.length - 1;
        System.out.println(BSRecursion(arr, 12  , start, end));
    }

    public static int BSRecursion(int[] arr, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if (start > end) {
            return -1;
        } else if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return BSRecursion(arr, target, start, mid - 1);
        } else {
            return BSRecursion(arr, target, mid + 1, end);
        }
    }
}