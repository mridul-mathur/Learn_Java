package Notes.LinearSearching;

public class Search_minimum {
    public static void main(String[] args) {
        int[] arr = {10, 19, 91, 18, 71, 16, -10, -2, 20, 55};
        System.out.println(Search_min(arr));
    }

    private static int Search_min(int[] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int min = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
