package Interview150.Array_String;

//42. Trapping Rain Water

/*
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.



Example 1:


Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9


Constraints:

n == height.length
1 <= n <= 2 * 104
0 <= height[i] <= 105
 */
public class TrappingWater {
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 3, 2, 5};
        System.out.println(trap(height));
    }

    private static int trap(int[] height) {
        if (height.length < 3) {
            return 0;
        }

//        int[] l = new int[height.length];
//        int maxl = 0;
//        int[] r = new int[height.length];
//        int maxr = height[height.length - 1];
//        for (int i = 0; i < height.length; i++) {
//            l[i] = maxl;
//            if (height[i] > maxl) {
//                maxl = height[i];
//            }
//            r[height.length - 1 - i] = maxr;
//            if (height[height.length - 1 - i] > maxr) {
//                maxr = height[height.length - 1 - i];
//            }
//        }
//        int sum = 0;
//        for (int i = 0; i < height.length; i++) {
//            int min = Math.min(l[i], r[i]);
//            if (min - height[i] > 0) {
//                sum += min - height[i];
//            }
//        }
//        return sum;

        int maxl = 0;
        int maxr = height[height.length - 1];
        int s = 0;
        int e = height.length - 1;
        int sum = 0;
        while (s < e) {
            if (maxl <= maxr) {
                if (maxl - height[s] > 0) {
                    sum += maxl - height[s];
                } else {
                    maxl = height[s];
                }
                s++;
            }
            if (maxl > maxr) {
                if (maxr - height[e] > 0) {
                    sum += maxr - height[e];
                } else {
                    maxr = height[e];
                }
                e--;
            }
        }
        return sum;
    }
}
