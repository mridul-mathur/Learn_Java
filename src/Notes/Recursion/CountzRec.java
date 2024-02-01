package Notes.Recursion;

public class CountzRec {
    static int count = 0;

    public static void main(String[] args) {
        int n = 101100110;
        count(n);
    }

    private static void count(int n) {
        int x = n % 10;
        if (x == 0) {
            count++;
        }
        if (n / 10 == 0) {
            System.out.println(count);
            return;
        } else {
            count(n / 10);
        }
    }
}
