package Notes.BinarySearch;

public class Unkownorder {
    public static void main(String[] args) {
        int[] arr1 = {98, 76, 54, 32, 10, -12, -34, -56, -78, -90};
        int[] arr2 = {-98, -76, -54, -32, -10, 12, 34, 56, 78, 90};
        System.out.println("The index of target: " + agnousticBS(arr1, 54) + " : " + agnousticBS(arr2, 56));
    }

    private static int agnousticBS(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        int i = 0;
        while (arr[start] <= arr[end]) {
            int middle = start + (end - start) / 2;
            if (target > arr[middle]) {
                start = middle + 1;
            } else if (target < arr[middle]) {
                end = middle - 1;
            } else {
                return middle;
            }
            i++;
        }
        while (arr[end] <= arr[start]) {
            int middle = start + (end - start) / 2;
            if (target > arr[middle]) {
                end = middle - 1;
            } else if (target < arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
            i++;
        }
        return -1;
    }
}
