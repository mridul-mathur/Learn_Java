package Interview150.Binary_Search;

public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;
        int[] nums = new int[n];

        int i = 0, j = 0, k = 0;

        while (i <= n1 && j <= n2) {
            if (i == n1) {
                while (j < n2) {
                    nums[k++] = nums2[j++];
                }
                break;
            } else if (j == n2) {
                while (i < n1) {
                    nums[k++] = nums1[i++];
                }
                break;
            }

            if (nums1[i] < nums2[j]) {
                nums[k++] = nums1[i++];
            } else {
                nums[k++] = nums2[j++];
            }
        }
        int mid = nums.length / 2;
        if (nums.length % 2 == 0) {
            return (double) (nums[mid] + nums[mid - 1]) / (double) 2;
        } else {
            return (double) nums[mid];
        }
    }
}
