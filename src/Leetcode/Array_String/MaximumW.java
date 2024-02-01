package Leetcode.Array_String;

//1672. Richest Customer Wealth
public class MaximumW {
    public static void main(String[] args) {
        int[][] accounts = {
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}
        };
        System.out.println(maximumWealth(accounts));
    }

    private static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] p : accounts) {
            int sum = 0;
            for (int w : p) sum += w;
            max = Math.max(max, sum);
        }
        return max;
    }
}
