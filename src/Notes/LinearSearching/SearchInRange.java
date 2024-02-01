package Notes.LinearSearching;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -7, -10, 5, 10, 6, 8, -8};
        int target = -7;
        int start = 2;
        int end = 7;
        System.out.println(SearchInRange(arr, target, 2, 5));
    }

    private static int SearchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
