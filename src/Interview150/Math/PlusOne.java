package Interview150.Math;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9, 9, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    private static int[] plusOne(int[] digits) {
        int i = 0;
        while (i < digits.length) {
            if (digits[digits.length - 1 - i] < 9) {
                digits[digits.length - 1 - i]++;
                return digits;
            } else if (i==digits.length-1) {
                int[] arr = new int[digits.length+1];
                arr[0]=1;
                return arr;
            } else {
                digits[digits.length - 1 - i] = 0;
                i++;
            }
        }
        return digits;
    }
}
