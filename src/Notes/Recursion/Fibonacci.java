package Notes.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int ans = fibo(n);
        System.out.println(ans);
    }

    public static int fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
