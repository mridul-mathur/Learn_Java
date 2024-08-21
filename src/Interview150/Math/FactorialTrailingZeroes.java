package Interview150.Math;

public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        int n = 3125;
        System.out.println(trailingZeroes(n));
    }

    private static int trailingZeroes(int n) {
        int ans = 0;
        if (n < 5) {
            return ans;
        }
        for (int i = 1; i <=5; i++) {
            int x = (int) (n / Math.pow(5, i));
            if (x == 0) {
                return ans;
            }
            ans +=x;
        }
        return ans;
    }
}
