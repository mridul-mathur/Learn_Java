package Interview150.DP_1D;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 35;
        System.out.println(climbStairs(n));
    }

    private static int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }
        return climbStairs(n-1)+climbStairs(n-2);

    }
}
