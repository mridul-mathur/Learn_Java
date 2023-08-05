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
            rev = rev * 10 + rem;
            num /= 10;
        }
        System.out.println(rev);

        //Q6 Swap two numbers
        System.out.println("Enter 2 numbers: ");
        int a1 = in.nextInt();
        int b1 = in.nextInt();
        swap(a1, b1);
        System.out.println(a1 + " : " + b1);
/*  the numbers actually didn't swap as the values changes
            just under a function.
            the num1 and num2 are assigned with the value of a1 and b1
            but a1 and b1 are not assigned the value of num1 and num2
            a reference variable is passed and hence the actual values
            doesn't change at all.*/


        //Q7 number is Prime or not
        int n1 = in.nextInt();
        System.out.println(isprime(n1));


        //Q8 Print all three digit armstrong numbers
        for (int number = 100; number < 1000; number += 1) {
            if (isarms(number)) {
                System.out.print(number + " ");
            }
        }
    }

    private static boolean isarms(int number) {
        int arm = number;
        int sum = 0;
        while (number > 0) {
            int rem = number % 10;
            number /= 10;
            sum += rem * rem * rem;
        }
        if (sum == arm) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isprime(int n1) {
        if (n1 <= 1) {
            System.out.print("Prime: ");
            return false;
        }
        int c = 2;
        while (c * c <= n1) {
            if (n1 % c == 0) {
                System.out.print("Prime: ");
                return false;
            }
            c += 1;
        }
        System.out.print("Prime: ");
        return c * c > n1;
    }

    private static void swap(int num1, int num2) {
        System.out.println("Before Swapping: " + num1 + " : " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swapping: " + num1 + " : " + num2);
    }
}