package Leetcode.Array_String;

import java.util.ArrayList;
import java.util.List;

public class ArrayForm {
    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9};
        int k = 909090;
        System.out.println(addToArrayForm(num, k));
    }

    private static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> nums = new ArrayList<Integer>(num.length);
        boolean carry = false;
        for (int i = num.length - 1; i >= 0; i--) {
            if (carry) {
                num[i] += 1;
                carry = false;
            }
            if (k > 0) {
                int x = k % 10;
                num[i] += x;
                k = k / 10;
            }
            if (num[i] > 9 && k>=0) {
                num[i] %=10;
                carry = true;
                nums.add(0, num[i]);
                if (i==0){
                    nums.add(0,1);
                }
            }else {
                nums.add(0, num[i]);
            }
        }
        return nums;
    }
}
