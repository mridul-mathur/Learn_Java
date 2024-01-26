package Notes.LinearSearching;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7806, -10, -111, -2376};
        int num = CountEven(arr);
        System.out.println(num);
    }

    public static int CountEven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int numb = arr[i];
            int digit = 0;
            if (numb < 0) {
                numb = numb * -1;
            }
            while (numb > 0) {
                numb = numb / 10;
                digit++;
            }
            if (digit % 2 == 0 && digit != 0) {
                count++;
            }
        }
        return count;
    }
}
