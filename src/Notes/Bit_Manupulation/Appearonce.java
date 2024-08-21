package Notes.Bit_Manupulation;

//find the number that appears once.
public class Appearonce {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 2, 6, 3, 1, 4};
        int ans = appearonce(arr);
        System.out.println(ans);
    }

    private static int appearonce(int[] arr) {
        int unique = 0;
        for (int i = 0; i < arr.length; i += 1) {
            unique ^= arr[i];
        }
        if (unique == 0) {
            return Integer.MAX_VALUE;
        }
        return unique;
    }
}

