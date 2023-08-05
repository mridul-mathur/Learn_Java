package Notes.LinearSearching;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 23, 34},
                {98, 87, 76},
                {65, 45, 56},
        };
        int target = 76;
        int ans[] = search2d(arr, target);
        System.out.println(Arrays.toString(ans));
        //max value
        int max = maxvale(arr);
        System.out.println(max);
    }

    private static int maxvale(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

    private static int[] search2d(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
