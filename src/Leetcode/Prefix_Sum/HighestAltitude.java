package Leetcode.Prefix_Sum;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(largestaltitude(gain));
    }

    public static int largestaltitude(int[] gain) {
        int max = 0;
        int[] arr = altitudes(gain);
        int j = 0;
        while (j < arr.length) {
            if (arr[j] >= max) {
                max = arr[j];
            }
            j++;
        }
        return max;
    }

    public static int[] altitudes(int[] gain) {
        int[] arr = new int[gain.length + 1];
        int i = 1;
        arr[0] = 0;
        while (i < arr.length) {
            arr[i] = gain[i - 1] + arr[i - 1];
            i++;
        }
        return arr;
    }
}