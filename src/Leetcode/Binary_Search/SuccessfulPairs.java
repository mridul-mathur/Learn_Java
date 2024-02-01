package Leetcode.Binary_Search;

import java.util.Arrays;

public class SuccessfulPairs {
    public static void main(String[] args) {
        int[] spells = {3, 4, 2};
        int[] potions = {8, 5, 8, 3, 10, 76, 4, 3, 22, 16};
        long success = 30;
        int[] ans = successfulPairs(spells, potions, success);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] arr = new int[spells.length];
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            int start = 0;
            int end = potions.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                long product = (long) spells[i] * potions[mid];
                if (product >= success) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            arr[i] = potions.length - start;
        }
        return arr;
    }
}
