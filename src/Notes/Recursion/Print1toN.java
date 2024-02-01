package Notes.Recursion;

public class Print1toN {
    public static void main(String[] args) {
        int n = 5;
        print1ton(n);
    }

    private static void print1ton(int n) {
        if (n > 0) {
            print1ton(n - 1);
            System.out.println(n);
        }
    }
}
