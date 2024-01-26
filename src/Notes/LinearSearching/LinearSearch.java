package Notes.LinearSearching;


public class LinearSearch {
    public static void main(String[] args) {
        //searching some element in an array using linear search.
        //Worst case -> N comparisons.
        int[] arr = {-1, 2, -7, 3, 5, 9, 6, -10, 8, -4};
        int target = -10;
        int ans = linear_search(arr, target);
        System.out.println("The index of '" + target + "'  is: " + ans);
    }

    public static int linear_search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                } else {
                    continue;
                }
            }
        }
        return -2;
    }
}