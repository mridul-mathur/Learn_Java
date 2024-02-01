package Notes.Recursion.ArrRec;

import java.util.ArrayList;

public class MultiLSRec {

    static ArrayList<Integer> list = new ArrayList<>();

    //linear search to find all index.
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 8, 3, 3, 6, 4, 5};
        int target = 3;
        int i = 0;
        System.out.println(multiLSRec2(arr, target, i));
    }

    private static void multiLSRec1(int[] arr, int target, int i) {
        if (i == arr.length) {
            System.out.println(list);
            return;
        } else {
            if (arr[i] == target) {
                list.add(i);
            }
            multiLSRec1(arr, target, i + 1);
        }
    }

    private static ArrayList<Integer> multiLSRec2(int[] arr, int target, int i) {
        ArrayList<Integer> list = new ArrayList<>();
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        ArrayList<Integer> ansbelow = multiLSRec2(arr, target, i + 1);
        list.addAll(ansbelow);
        return list;
    }
}
