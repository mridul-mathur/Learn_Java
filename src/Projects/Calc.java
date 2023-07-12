package Projects;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // take input form user till user does not press X or x
        int ans = 0;

        while (true) {

            //taking operator as an input
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);

            int num1 = 0;
            int num2 = 0;
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                // input of two numbers
                System.out.print("Enter num1: ");
                num1 = in.nextInt();

                System.out.print("Enter num2: ");
                num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/' && num2 != 0) {
                    ans = num1 / num2;
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("invalid operation!!!!! \n" + "enter a valid operator");
            }
            System.out.println(num1 + " " + op + " " + num2 + " = " + ans);
        }


    }
}