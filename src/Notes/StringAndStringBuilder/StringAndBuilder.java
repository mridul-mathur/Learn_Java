package Notes.StringAndStringBuilder;

public class StringAndBuilder {
    public static void main(String[] args) {
        /*
        Strings are non-primitive datatype... It is a collection of chars.
        Syntax-:
        String name = new String();
        String name = "Mridul Mathur";
         */
        String a = "Mridul";
        String b = "Mridul";
        /*
        how are a and b stored in the memory?
        there is a string pool created in heap memory and the string a and
        b in the stack are pointing towards the same "Mridul" in the memory.
        Strings are immutable in java
         */
        a = "Mathur";
        /*
        here we are not changing the string object, instead here a new object
        is created.
        a -> to new object that "Mathur" that is created in the String pool.
        And the older object "Mridul" is shifted to garbage collection.
         */
        String p1 = "Mridul";
        String p2 = "Mridul";
        String p3 = "Mridul";
        String p4 = "Mridul";
        /*
        Why are Strings immutable?
        if p1 wants to change the name to "Sakshi" then immutability helps to
        protect the name of other people, as new object is created instead.
         */
        int n = 21;

        System.out.println();
    }
}
