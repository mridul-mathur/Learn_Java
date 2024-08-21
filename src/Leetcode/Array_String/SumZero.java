package Leetcode.Array_String;


//1304. Find N Unique Integers Sum up to Zero

import java.util.Arrays;

/*
Given an integer n, return any array containing n unique integers such that they add up to 0.



Example 1:

Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
Example 2:

Input: n = 3
Output: [-1,0,1]
Example 3:

Input: n = 1
Output: [0]


Constraints:

1 <= n <= 1000
 */
public class SumZero {

    public static void main(String[] args) {
        int n = 7;
        System.out.println(Arrays.toString(sumZero(n)));
    }

    private static int[] sumZero(int n) {
        int[] nums = new int[n];

        if (n % 2 != 0) {
            nums[n/2] = 0;
        }
        for (int i = 1; i <= n/2; i++) {
            nums[i-1] = i;
            nums[nums.length - i] = (~i) + 1;
        }
        return nums;
    }
}
