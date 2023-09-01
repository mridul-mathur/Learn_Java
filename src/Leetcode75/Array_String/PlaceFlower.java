package Leetcode75.Array_String;

public class PlaceFlower {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0, 0};
        int expected = 1;
        int available = FlowerPots(arr);
        System.out.println(available >= expected);
    }

    public static int FlowerPots(int[] arr) {
        int total = 0;
        if (arr[0] == 0 && arr[1] == 0) {
            arr[0] = 1;
            total += 1;
        }
        for (int i = 2; i < arr.length - 2; i++) {
            if (arr[i] == 0 && arr[i - 1] == 0 && arr[i + 1] == 0) {
                arr[i] = 1;
                total += 1;
            }
        }
        if (arr[arr.length - 1] == 0 && arr[arr.length - 2] == 0) {
            arr[arr.length - 1] = 1;
            total += 1;
        }
        return total;
    }
}