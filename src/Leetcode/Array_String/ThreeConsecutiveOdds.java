package Leetcode.Array_String;

//1550. Three Consecutive Odds
/*
Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.


Example 1:

Input: arr = [2,6,4,1]
Output: false
Explanation: There are no three consecutive odds.
Example 2:

Input: arr = [1,2,34,3,4,5,7,23,12]
Output: true
Explanation: [5,7,23] are three consecutive odds.


Constraints:

1 <= arr.length <= 1000
1 <= arr[i] <= 1000
 */
public class ThreeConsecutiveOdds {
    public static void main(String[] args) {
        int arr[] = {1, 2, 34, 3, 4, 5, 7, 23, 12};
        System.out.println(threeConsecutiveOdds(arr));
    }

    private static boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int i = 1;
        while (i <= arr.length - 2) {
            if (arr[i + 1] % 2 != 0) {
                if (arr[i] % 2 != 0) {
                    if (arr[i - 1] % 2 != 0) {
                        return true;
                    } else {
                        i += 1;
                    }
                } else {
                    i += 2;
                }
            } else {
                i += 3;
            }
        }
        return false;
    }
}
