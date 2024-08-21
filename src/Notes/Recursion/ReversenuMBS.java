package Notes.Recursion;

public class ReversenuMBS {
    public static void main(String[] args) {
        int n = 8;
        reversenum(n);
    }

    private static void reversenum(int n) {
        System.out.print(n);
        if (n == 1) {
            return;
        }
        reversenum(n - 1);
    }
}
