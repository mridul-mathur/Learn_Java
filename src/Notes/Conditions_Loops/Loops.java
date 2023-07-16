package Notes.Conditions_Loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        /*for loop
         syntax-:
            for (initialization; bool exp; updation) {
                //code
            }
         */
        for (int i = 0; i < 10; i += 1) {
            System.out.print(" " + i);
        }


        /*while loop
         syntax-:
            while (bool exp) {
                //code
            }
         */
        int a = 10;
        while (a >= 0) {
            System.out.print(" " + a);
            a -= 2;
        }
        System.out.println();


        /*do while loop
         syntax-:
            do {
                //code
            } while (bool exp);
         */
        a = 9;
        do {
            System.out.println("Enter name :");
            String str = in.next();
            System.out.println(str);
            a -= 3;
        } while (a > 0);


    }
}
