package Interview150.Array_String;

//274. H-Index

/*
Given an array of integers citations where citations[i] is the number of citations a
researcher received for their ith paper, return the researcher's h-index.

According to the definition of h-index on Wikipedia: The h-index is defined as the maximum
value of h such that the given researcher has published at least h papers that have each
been cited at least h times.



Example 1:

Input: citations = [3,0,6,1,5]
Output: 3
Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had
received 3, 0, 6, 1, 5 citations respectively.
Since the researcher has 3 papers with at least 3 citations each and the remaining two with
no more than 3 citations each, their h-index is 3.
Example 2:

Input: citations = [1,3,1]
Output: 1


Constraints:

n == citations.length
1 <= n <= 5000
0 <= citations[i] <= 1000
 */

public class HIndex {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1, 6, 5};
        int ans = hIndex(nums);
        System.out.println(ans);
    }

    private static int hIndex(int[] citations) {
        int start = 0;
        int end = citations.length;
        int ans = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (canbe(citations, mid)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    private static boolean canbe(int[] citations, int mid) {
        int count = 0;
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= mid) {
                count++;
            }
        }
        return count >= mid;
    }
}
