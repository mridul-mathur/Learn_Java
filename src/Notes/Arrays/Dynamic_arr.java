package Notes.Arrays;

import java.util.ArrayList;

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
        System.out.println(arr.toArray());
        /*
            internal working of ArrayList-:
            size is actually fixed internally but when array list fills to
            a particular amount, it will create a new arraylist of double the
            size and the old list elements are copied in the new list and the
            old arrList is deleted.
        */
    }
}
