package Notes.Recursion;

public class Product1ton {
    public static void main(String[] args) {
        int n = -4;
        System.out.println(product1ton(n));
    }

    private static int product1ton(int n) {
        if (n >= 0) {
            if (n <= 1) {
                return n;
            } else {
                return n * (product1ton(n - 1));
            }
        } else {
            if (n >= -1) {
                return n;
            } else {
                return n * (product1ton(n + 1));
            }
        }
    }
}