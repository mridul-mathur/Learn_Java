package Notes.Recursion.ArrRec;

public class LSRec {
    //search element in the array using recursion ls.
    public static void main(String[] args) {
        int[] arr = {91, 82, 73, 64, 55, 46, 37, 28, 19};
        int target = 37;
        int i = 0;
        System.out.println(lsrec(arr, target, i));
    }

    private static int lsrec(int[] arr, int target, int i) {
        if (i != arr.length) {
            if (arr[i] == target) {
                return i;
            } else {
                return lsrec(arr, target, i + 1);
            }
        } else {
            return -1;
        }
    }
}
