package Notes.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class D2_arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        Syntax-:
        1 2 3
        4 5 6
        7 8 9
        datatype arr_name[][] = new datatype[rows][columns];
        //no. of rows is necessary not columns
        */
        int[][] arr = new int[3][3];
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        System.out.println(Arrays.toString(arr1[0]));

        //input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        //output
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
