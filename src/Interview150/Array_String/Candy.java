package Interview150.Array_String;

import java.util.Arrays;

public class Candy {
    public static void main(String[] args) {
        int[] ratings = {1, 2, 87, 87, 87, 2, 1};
        System.out.println(candy(ratings));
    }

    private static int candy(int[] ratings) {
        int sum = 0;

        int[] candies = new int[ratings.length];
        Arrays.fill(candies, 1);

        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        for (int c : candies) {
            sum += c;
        }
        return sum;
    }
}
