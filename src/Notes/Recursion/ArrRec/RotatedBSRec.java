package Notes.Recursion.ArrRec;

public class RotatedBSRec {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 11, 1, 2, 3, 4};
        int target = 11;
        int s = 0;
        int e = arr.length - 1;
        int ans = search(arr, target, s, e);
        System.out.println(ans);
    }

    private static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (arr[s] < arr[m]) {
            if (target >= arr[s] && target <= arr[e]) {
                return search(arr, target, s, m);
            } else {
                return search(arr, target, m + 1, e);
            }
        }
        if (target >= arr[m] && target <= arr[e]) {
            return search(arr, target, m + 1, e);
        }
        return search(arr, target, s, m);
    }
}
