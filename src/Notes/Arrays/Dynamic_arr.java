package Notes.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Dynamic_arr {
    public static void main(String[] args) {
    /*
        syntax-:
        ArrayList <datatype> name = new ArrayList<datatype>(initial capacity);

        the specified datatype should always be wrapper classes
        adding datatype after new is not necessary
        adding initial capacity is not necessary
    */
        ArrayList<Integer> arr = new ArrayList<>(5);
        arr.add(67);
        arr.add(12);
        arr.add(43);
        System.out.println(arr);

        System.out.println(arr.contains(12));
        arr.add(0, 21);
        arr.set(0, 99);
        System.out.println(Arrays.toString(arr.toArray()));
        /*
            internal working of ArrayList-:
            size is actually fixed internally but when array list fills to
            a particular amount, it will create a new arraylist of double the
            size and the old list elements are copied in the new list and the
            old arrList is deleted.
        */
    }

    private static int startFrom(ArrayList<Integer> s) {
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
