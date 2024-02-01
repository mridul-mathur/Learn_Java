package Leetcode.Two_Pointers;

public class MaxArea {
    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int area = maxArea(arr);
        System.out.println(area);
    }

    private static int maxArea(int[] height) {
        int h1 = 0;
        int h2 = height.length - 1;
        int maxarea = 0;
        while (h1 < h2) {
            int area = 0;
            if (height[h1] < height[h2]) {
                area = height[h1] * (h2 - h1);
            } else {
                area = height[h2] * (h2 - h1);
            }
            if (maxarea < area) {
                maxarea = area;
            }
            if (height[h1] > height[h2]) {
                h2 -= 1;
            } else {
                h1 += 1;
            }
        }
        return maxarea;
    }
}
