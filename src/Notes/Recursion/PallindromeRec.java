package Notes.Recursion;

public class PallindromeRec {
    private static int rev = 0;

    public static void main(String[] args) {
        int numb = 1224221;
        System.out.println(pallindrome(numb));
    }

    private static boolean pallindrome(int n) {
        revnumb(n);
        if (n == rev) {
            return true;
        } else return false;
    }

    private static void revnumb(int n) {
        if (n == 0) {
            return;
        } else {
            int x = n % 10;
            rev = (rev * 10) + x;
            revnumb(n / 10);
        }
    }
}
