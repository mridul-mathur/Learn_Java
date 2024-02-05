package Leetcode.Binary_Search;

//374. Guess Number Higher or Lower
public class GuessNumber {
    static double p = Math.random();

    private static int guess(int n, int num, double p) {
        int p1 = (int) (p * n);
        if (num > p1) {
            return -1;
        } else if (num < p1) {
            return 1;
        } else return 0;
    }

    public static void main(String[] args) {
        int n = (int) (Math.random() * 100);
        System.out.println("n: " + n);
        System.out.println("p: " + guessNumber(n));
    }

    private static int guessNumber(int n) {
        if (n == 1) return 1;
        int start = 1;
        int end = n;
        while (start < end) {
            int num = start + (end - start) / 2;
            int guess = guess(n, num, p);
            if (guess == -1) {
                end = num;
            } else if (guess == 1) {
                start = num;
            } else if (guess == 0) {
                return num;
            }
        }
        return 0;
    }
}
