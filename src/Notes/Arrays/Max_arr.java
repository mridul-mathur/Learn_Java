package Notes.Arrays;

public class Max_arr {
    public static void main(String[] args) {
        int[] arr = {12, 23, 45, 8, 34};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
