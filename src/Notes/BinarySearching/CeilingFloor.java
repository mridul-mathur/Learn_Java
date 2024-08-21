package Notes.BinarySearching;

public class CeilingFloor {
    public static void main(String[] args) {
        int[] arr = {-98, -87, -76, -65, -54, -43, -32, -21, 12, 23, 34, 45, 56, 67, 78, 89, 90};
        int ceilng = ceiling(arr, 77);
        System.out.println(ceilng);
        int floor = floor(arr, -45);
        System.out.println(floor);
    }

    private static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        if (target < arr[0] || arr.length == 1) {
            return arr[0];
        }
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                if (arr[mid - 1] <= target) {
                    return arr[mid];
                }
                end = mid;
            } else if (arr[mid] < target) {
                start = mid;
            }
        }
        return Integer.MAX_VALUE;
    }

    private static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        if (target >= arr[arr.length - 1] || arr.length == 1) {
            return arr[arr.length - 1];
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= target) {
                if (arr[mid + 1] > target) {
                    return arr[mid];
                }
                start = mid + 1;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return Integer.MIN_VALUE;
    }
}
