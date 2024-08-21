package Leetcode.Binary_Search;

//875. Koko Eating Bananas

/*
Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas.
The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of
 bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats
 all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards
return.

Return the minimum integer k such that she can eat all the bananas within h hours.


Example 1:

Input: piles = [3,6,7,11], h = 8
Output: 4
Example 2:

Input: piles = [30,11,23,4,20], h = 5
Output: 30
Example 3:

Input: piles = [30,11,23,4,20], h = 6
Output: 23


Constraints:

1 <= piles.length <= 104
piles.length <= h <= 109
1 <= piles[i] <= 109
 */
public class KokoBanana {
    public static void main(String[] args) {
        //binary search on answer
        int[] piles = {30, 11, 23, 4, 20};
        int h = 6;
        System.out.println(minEatingSpeed(piles, h));
    }

    private static int minEatingSpeed(int[] piles, int h) {
        long start = 1;
        long end = maxelement(piles);
        long ans = end;

        if (h == piles.length) {
            return (int) end;
        }

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long sum = 0;
            for (int i = 0; i < piles.length; i++) {
                if (piles[i] <= mid) {
                    sum += 1;
                } else {
                    sum += Math.ceilDiv(piles[i], mid);
                }
            }
            if (sum <= h) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return (int) ans;
    }


    private static long maxelement(int[] piles) {
        long max = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        return max;
    }
}
