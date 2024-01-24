package Notes.Recursion;

public class Sum1toN {
    public static void main(String[] args) {
        int n = 5;
        int sum = sumrec(n);
        System.out.println(sum);
    }

    public static int sumrec(int n) {
        if (n <= 1) {
            return n;
        } else {
            return n + sumrec(n - 1);
        }
    }
}
