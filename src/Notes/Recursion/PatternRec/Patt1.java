package Notes.Recursion.PatternRec;

/*
patt1-:
        * * * * *
        * * * *
        * * *
        * *
        *
 */
public class Patt1 {
    public static void main(String[] args) {
        int n = 5;
        print1(n, 0);
        print2(n, 0);
    }

    private static void print1(int n, int i) {
        if (n == 0) {
            return;
        }
        if (n > i) {
            System.out.print("* ");
            print1(n, i + 1);
        } else {
            System.out.println();
            print1(n - 1, 0);
        }

    }

    private static void print2(int n, int i) {
        if (n == 0) {
            return;
        }
        if (n > i) {
            print2(n, i + 1);
            System.out.print("* ");
        } else {
            print2(n - 1, 0);
            System.out.println();
        }

    }
}
