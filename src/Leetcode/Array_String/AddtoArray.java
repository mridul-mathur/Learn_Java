package Leetcode.Array_String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddtoArray {
    public static void main(String[] args) {
        int[] num = {3};
        int k = 321;
        System.out.println(addToArrayForm(num, k));
    }

    private static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>(num.length);
        int carry = k;
        for (int i = num.length - 1; i >= 0; i--) {
            int sum = num[i] + carry;
            list.add(sum % 10);
            carry = sum / 10;
        }
        while (carry > 0) {
            list.add(carry % 10);
            carry /= 10;
        }
        Collections.reverse(list);
        return list;
    }
}
