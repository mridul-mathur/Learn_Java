package Notes.Recursion;

public class Product1ton {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(product1ton(n));
    }

    public static int product1ton(int n) {
        if (n <= 2) {
            return n;
        } else {
            return n * (product1ton(n - 1));
        }
    }
}