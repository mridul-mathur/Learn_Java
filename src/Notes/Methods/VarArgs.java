package Notes.Methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        /*when we do not know how many inputs are
        we giving.
        */
        fun(1, 3, 5, 7, 9); //return array[1,3,5,7,9]
        fun();//an empty array is printed []
    }

    static void fun(int... v) {
        /*this internally is taking an array of integers
         */
        System.out.println(Arrays.toString(v));
    }
}
