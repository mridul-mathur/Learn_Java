package Leetcode75.Array_String;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MostCandies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr= {2,3,5,1,3};
        int extracandels = 3;
        System.out.println(Arrays.toString(kidsWithCandies(arr, extracandels)));
    }
    public static int Max_Value(int[]arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }
    public static boolean[] kidsWithCandies(int[]arr, int candies){
        boolean[] list = new boolean[arr.length];
        int max = Max_Value(arr);
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] + candies >= max){
                list[i] = true;
            }
            else {
                list[i]=false;
            }
        }
        return list;
    }
}
