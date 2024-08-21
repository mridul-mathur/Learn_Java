package Notes.Recursion.ArrRec;

public class Sorted {
    //find if array is sorted or not.
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 9, 10};
        int i = arr.length - 1;
        System.out.println(sorted(arr, i));
    }

    private static boolean sorted(int[] arr, int i) {
        if (i == 0) {
            return true;
        } else {
            return arr[i - 1] < arr[i] && sorted(arr, i - 1);
        }
    }
}
