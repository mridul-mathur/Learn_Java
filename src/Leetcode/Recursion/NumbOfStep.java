package Leetcode.Recursion;

public class NumbOfStep {
    static int s = 0;

    public static void main(String[] args) {
        int num = 8;
        int steps = numberOfSteps(num);
        System.out.println(steps);
    }

    private static int numberOfSteps(int num) {
        if (num == 0) {
            return s;
        } else {
            if (num % 2 == 0) {
                s++;
                return numberOfSteps(num / 2);
            } else {
                s++;
                return numberOfSteps(num - 1);
            }
        }
    }
}
