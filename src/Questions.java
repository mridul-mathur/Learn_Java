import java.util.ArrayList;
import java.util.Arrays;

public class Questions {
    public static void main(String[] args) {
        int A = 6;
        int[][] B = {
                {1, 5, 2},
                {1, 6, 1},
                {1, 2, 1}
        };
        System.out.println(solve(A, B));
    }

    public static ArrayList<Integer> solve(int A, int[][] B) {
        ArrayList<Integer> arr = new ArrayList<Integer>(1);
        ArrayList<ArrayList> constraint = makeSubArray(B);
        arr.add(0, -1);
        return arr;
    }

    public static ArrayList makeSubArray(int[][] b) {
        ArrayList<Integer> s = new ArrayList<Integer>(1);
        ArrayList<Integer> d = new ArrayList<Integer>(1);
        ArrayList<Integer> t = new ArrayList<Integer>(1);
        for (int i = 0; i < b.length; i++) {
            s.add(i, b[i][0]);
            d.add(i, b[i][1]);
            t.add(i, b[i][2]);
        }
        ArrayList<ArrayList> arr = new ArrayList<ArrayList>(1);
        arr.add(s);
        arr.add(d);
        arr.add(t);
        return arr;
    }

    public static boolean deadlineCheck(ArrayList<Integer> d, int day) {
        for (int i = 0; i < d.size(); i++) {
            if (day == d.get(i)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static int startFrom (ArrayList<Integer>s) {
        int min = 0;
        if (s.get(0) < s.get(1) && s.get(0) <= s.get(2)) {
            min = 0;
        } else if (s.get(1) <= s.get(0) && s.get(1) < s.get(2)) {
            min = 1;
        } else if (s.get(2) < s.get(0) && s.get(2) <= s.get(1)) {
            min = 2;
        } else {
            return -1;
        }
        return min;
    }
}