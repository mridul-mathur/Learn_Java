package Notes.BinarySearching;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 2, 4, 6, 7, 5, 3, 1};
        int target = 7;
        System.out.println(findInMountain(target, arr));
    }

    private static int findInMountain(int target, int[] mountainArr) {
        int index = -1;
        int start = 0;
        int peak = peak(mountainArr);
        int end = peak;
        if (mountainArr[peak] == target) {
            return peak;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > mountainArr[mid]) {
                start = mid + 1;
            } else if (target < mountainArr[mid]) {
                end = mid - 1;
            } else {
                index = mid;
                break;
            }
        }
        if (index == -1) {
            start = peak;
            end = mountainArr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target > mountainArr[mid]) {
                    end = mid - 1;
                } else if (target < mountainArr[mid]) {
                    start = mid + 1;
                } else {
                    index = mid;
                    break;
                }
            }
        }
        return index;
    }

    public static int peak(int[] mountainArr) {
        int start = 0;
        int end = mountainArr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr[mid] < mountainArr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
