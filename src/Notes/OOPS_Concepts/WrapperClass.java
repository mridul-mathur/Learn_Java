package Notes.OOPS_Concepts;

public class WrapperClass {
    public static void main(String[] args) {
        int a = 10;
        Integer num = 45;
        // This is a object
        // this gives many functions for int
        System.out.println(num.toString());
    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
