package Notes.BinarySearch;

public class CeilingFloor {
    public static void main(String[] args) {
        int[] arr = {-98, -87, -76, -65, -54, -43, -32, -21, 12, 23, 34, 45, 56, 67, 78, 89, 90};
        int ceilng = floor(arr, 99);
        System.out.println(ceilng);
        int floor = ceiling(arr, -99);
        System.out.println(floor);
    }

    private static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target>arr[mid]){
                start=mid+1;
            }
            if(target<arr[mid]){
                if (target<arr[0]){
                    return arr[0];
                }
                if (target>=arr[mid-1]){
                    return arr[mid];
                }
                end = mid-1;
            }
        }
        return Integer.MAX_VALUE;
    }

    private static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= target) {
                if (target >= arr[arr.length - 1]) {
                    return arr[arr.length - 1];
                }
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
