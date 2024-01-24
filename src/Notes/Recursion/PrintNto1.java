package Notes.Recursion;

public class PrintNto1 {
    public static void main(String[] args) {
        int n = 5;
        printnto1(n);
    }

    public static int printnto1(int n) {
        if (n > 0) {
            System.out.println(n);
            return printnto1(n - 1);
        } else {
            return 0;
        }
    }
}
