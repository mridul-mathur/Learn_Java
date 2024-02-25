package Leetcode.Array_String;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 22, 2, 6, 1234, 7835};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }

    private static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if ((int) Math.log10(num) % 2 == 1) {
                count++;
            }
        }
        return count;
    }
}
