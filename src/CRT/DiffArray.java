package CRT;


import java.util.ArrayList;
import java.util.Arrays;

public class DiffArray {
    public static ArrayList<Integer>[] findDistinct(int[] nums1, int[] nums2) {
        ArrayList<Integer> notInNums2 = new ArrayList<>();
        ArrayList<Integer> notInNums1 = new ArrayList<>();

        for (int num : nums1) {
            boolean found = false;
            for (int compare : nums2) {
                if (num == compare) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                notInNums2.add(num);
            }
        }

        for (int num : nums2) {
            boolean found = false;
            for (int compare : nums1) {
                if (num == compare) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                notInNums1.add(num);
            }
        }

        ArrayList<Integer>[] result = new ArrayList[2];
        result[0] = notInNums2;
        result[1] = notInNums1;
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        ArrayList<Integer>[] answer = findDistinct(nums1, nums2);
        System.out.println(Arrays.toString(answer));
    }
}
