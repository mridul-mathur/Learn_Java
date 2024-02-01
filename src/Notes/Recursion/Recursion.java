package Notes.Recursion;

public class Recursion {
    public static void main(String[] args) {
        /*
        How function call works-:
            while the function is not finished exe, it will remain in stack.
            then it calls another function and it sits above the previous one.
            so when the last function which is at top of stack is exe then one
            by one functions gets out of the stack.
        */

        /*
        What is recursion?
        A function calling itself until some base condition is reached.

        Syntax of a recursive function -:

        function(parameter){
            if(base condition){
                return definite answer
            }
            function(parameter condition);
        */
        int n =5;
        System.out.println(printnumb(n));
        System.out.println(printname("Mridul" , n));
    }

    private static int printnumb(int n) {
        if (n == 0) {
            return n;
        } else {
            System.out.println(n);
            return printnumb(n - 1);
        }
    }
    private static String printname(String naam,int n){
        while(n>1) {
            System.out.println(naam);
            n -= 1;
            printname(naam, n);
            return naam;
        }
        return null;
    }
}
