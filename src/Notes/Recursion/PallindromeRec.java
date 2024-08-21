package Notes.Recursion;

public class PallindromeRec {

    public static void main(String[] args) {
        int numb = 1234;
        System.out.println(pallindrome(numb));
    }

    private static boolean pallindrome(int n) {
        if (n < 0) {
            return false;
        }
        return n == revnumb(n, 0);
    }

    private static int revnumb(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        rev = (rev * 10) + (n % 10);
        return revnumb(n / 10, rev);
    }
}
