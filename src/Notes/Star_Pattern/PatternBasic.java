package Notes.Star_Pattern;

public class PatternBasic {
    public static void main(String[] args) {
        /*
         * Run the outer for loop for number of lines(rows).
         * Run the inner loop for elements(columns).
         * OR
         * number of lines = number of times outer loop
         * number of elements in a line = number of time inner loop for that line
         * total time inner loop = inner loop for a line * number of times outer loop.
         */

        /*
        Print-:

        1.  *
            * *
            * * *
            * * * *
            * * * * *

        2.  * * * * *
            * * * * *
            * * * * *
            * * * * *
            * * * * *

        3.  * * * * *
            * * * *
            * * *
            * *
            *

        4.  *
            * *
            * * *
            * * * *
            * * * * *
            * * * *
            * * *
            * *
            *

        5.          *
                  * *
                * * *
              * * * *
            * * * * *

        6.       *
                * *
               * * *
              * * * *
             * * * * *
        7.
        */
        int n = 5;
        pattern1(n);
        System.out.println();
        pattern2(n);
        System.out.println();
        pattern3(n);
        System.out.println();
        pattern4(n);
        System.out.println();
        pattern5(n);
        System.out.println();
        pattern6(n);
    }

    private static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
