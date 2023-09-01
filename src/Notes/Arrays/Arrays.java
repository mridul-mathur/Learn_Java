package Notes.Arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //Arrays are collection of data with same datatype.
        /*
            Syntax-:
            datatype [] var_name = new datatype[size];
            or
            datatype var_name [] = new datatype[size];
        */

        // storing 5 roll no.
        int[] num = new int[5];
        //or directly
        int[] roll = {1, 2, 3, 4, 5};
        //int roll = {0,1,2,3,4} <- Index of arrays begin from 0;
        int[] ros;// declarations of array;
        ros = new int[10];//initialization: the memory creation happens here.
        /*
        this is now object that is stored in heap.
        dynamic memory allocations, array objects are not
        stored continuous(Heap storage).
        */
        int a = Integer.valueOf(20);
        System.out.println(a);
        System.out.println(roll[2]);//2 is the index of array, this prints 3
        int[] numb = new int[3];
        System.out.println(numb); // this prints 0 for int null for string.


        // null is a special literal value in java.
        //int y  = null; error: null can't be assigned to  primitives.
        String c = null;

        //what if we have an array of objects not primitives then
        //what should be the predefined value?

        String[] arr1 = new String[5];//at the initialization object of
        //array point to null.
        //this is a array of objects not primitives.

        // input in arrays

        Scanner in = new Scanner(System.in);
        int[] arrn = new int[5];
        for (int i = 0; i < arrn.length; i += 1) {
            arrn[i] = in.nextInt();
        }
        for (int i = 0; i < arrn.length; i++) {
            System.out.print(arrn[i] + "  ");
        }
        System.out.println(java.util.Arrays.toString(arrn));

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.next();
        }
        System.out.print(java.util.Arrays.toString(arr1));
    }
}
