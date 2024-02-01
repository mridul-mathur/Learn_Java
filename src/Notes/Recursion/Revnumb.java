package Notes.Recursion;

public class Revnumb {
    static int rv = 0;

    public static void main(String[] args) {
        int numb = 935281265;
        revnumb(numb);
        System.out.println(rv);
    }

    private static void revnumb(int n) {
        if (n == 0) {
            return;
        } else {
            int x = n % 10;
            rv = (rv * 10) + x;
            revnumb(n / 10);
        }
    }
}
