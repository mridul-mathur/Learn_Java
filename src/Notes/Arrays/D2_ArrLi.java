package Notes.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class D2_ArrLi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        //initialization
        for (int i = 0; i < 3; i++) {
            arr.add(new ArrayList<>());
        }
        // add element
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr.get(i).add(in.nextInt());
            }
        }
        System.out.println(arr);
    }
}
