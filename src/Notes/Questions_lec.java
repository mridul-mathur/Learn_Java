package Notes;

import java.util.Scanner;

public class Questions_lec {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Q1 Find the largest of 3 numbers
        int a = 10;
        int b = 20;
        int c = 30;

        if (a > b || a > c) {
            System.out.println("a is largest");
        }
        if (b > c) {
            System.out.println("b is largest");
        } else {
            System.out.println("c is largest");
        }

        // Q2 Fibonacci Series
        int n = in.nextInt();
        int x = 0;
        int y = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(y + " ");
            int temp = y;
            y += x;
            x = temp;
        }
        System.out.println();
        // Q3 Find number of occurances

        int arr[] = {1, 3, 2, 6, 2, 5, 9, 8, 2, 4, 2, 7, 2};
        int count = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == 2) {
                count += 1;
            }
            i += 1;
        }
        System.out.println("Number of time 2 occurs: " + count);

        //Q4 the case check problem
        char ch = in.next().trim().charAt(0);
        //.trim() function is used to delete extra spaces
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower Case");
        } else {
            System.out.println("Upper Case");
        }

        //Q5 Reverse a number

        int num = in.nextInt();
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev*10 + rem;
            num /= 10;
        }
        System.out.println(rev);
    }
}