package Notes.BinarySearching;

public class Greatestchar {
    public static void main(String[] args) {
        char[] arr = {'c', 'd', 'g', 'm', 'p', 't', 'w'};
        System.out.println(greater(arr, 'p'));
    }

    private static char greater(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        if (target < arr[0] || target > arr[arr.length - 1]) {
            return arr[0];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if ((target > arr[mid]) && (target < arr[mid + 1])) {
                return arr[mid + 1];
            } else if (target == arr[mid]) {
                return arr[mid];
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return Character.MAX_VALUE;
    }
}
