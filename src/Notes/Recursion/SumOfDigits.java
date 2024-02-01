package Notes.Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 12345;
        int sum = sumofdigit(num);
        System.out.println(sum);
    }

    private static int sumofdigit(int num) {
        if (num > 0) {
            return num % 10 + sumofdigit(num / 10);
        }
        return 0;
    }
}