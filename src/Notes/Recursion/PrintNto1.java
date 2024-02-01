package Notes.Recursion;

public class PrintNto1 {
    public static void main(String[] args) {
        int n = 5;
        printnto1(n);
    }

    private static void printnto1(int n) {
        if (n > 0) {
            System.out.println(n);
            printnto1(n - 1);
        }
    }
}
