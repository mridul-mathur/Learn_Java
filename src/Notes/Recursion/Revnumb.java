package Notes.Recursion;

public class Revnumb {
    static int sum = 0;
    public static void main(String[] args) {
        int numb = 13579;
        revnumb1(numb);
        System.out.println(sum);
    }

    public static void revnumb1(int num) {
        if (num == 0) {
            return;
        }
        int x = num % 10;
        sum = sum * 10 + x;
        revnumb1(num/10);
    }
}
