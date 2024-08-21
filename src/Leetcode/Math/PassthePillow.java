package Leetcode.Math;

public class PassthePillow {
    public static void main(String[] args) {
        int n = 18;
        int time = 38;

        System.out.println(passThePillow(n, time));
    }

    private static int passThePillow(int n, int time) {
        int direc = time / (n - 1);
        int val = time % (n - 1);
        if (direc % 2 == 0) {
            return (val + 1);
        } else {
            return n - val;
        }
    }
}
