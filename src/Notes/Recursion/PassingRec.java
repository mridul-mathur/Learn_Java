package Notes.Recursion;

public class PassingRec {
    public static void main(String[] args) {
        concept1(5);
        concept2(0);
    }

    private static void concept1(int i) {
        if (i == 0) {
        } else {
            // concept(i--); infinite recursion error.
            /*i-- vs --i
                i-- passes the value first then subtracts it
                --i subtracts first then passes the value of it.
             */
            concept1(--i);
        }
    }

    private static void concept2(int i) {
        while (i < 5) {
            System.out.println(++i);
        }
        i = 0;
        while (i < 5) {
            System.out.println(i++);
        }
    }
}
