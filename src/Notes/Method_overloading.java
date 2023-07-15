package Notes;

public class Method_overloading {
    public static void main(String[] args) {
        /*function overloading happens when two functions
         of the same name are called but the arguments must
         be different. args can be of same type.
         */

        fun(21, "Mridul");
        fun(21, 43);

        sum(21,32);
        sum(43,54,65);
    }

    static void fun(int a, int b) {
        System.out.println("FirstOne");
    }

    static void fun(int c, String n) {
        System.out.println("SecondOne");
    }

    static int sum(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }

    static int sum(int a, int b, int c) {
        System.out.println(a + b + c);
        return a + b + c;
    }
}
