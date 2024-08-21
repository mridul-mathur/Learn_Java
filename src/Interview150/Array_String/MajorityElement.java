package Interview150.Array_String;

//169. Majority Element
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int sol = majorityElement(nums);
        System.out.println(sol);
    }

    private static int majorityElement(int[] nums) {
        int count = 0;
        int ans = 0;
        for (int i : nums) {
            if (count == 0) {
                ans = i;
            }
            if (i == ans) {
                count++;
            } else {
                count--;
            }
        }
        return ans;
    }
}

/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that
the majority element always exists in the array.


Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

 */
