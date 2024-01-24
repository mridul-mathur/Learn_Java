package Notes.Methods;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        //Functions / Methods are just a block of code.
        greet();
        int x = 0;
        int y = 0;
        int ans = Sum(x, y);
        System.out.println("the sum is: " + ans);
    }

    /*
        access odifiemr return_type name(arguments){
            body;
            return statement;
        }
     */
    public static int Sum(int a, int b) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1: ");
        a = in.nextInt();
        System.out.println("Enter num2: ");
        b = in.nextInt();
        return a + b;
    }

    /*
        a function can also be of void type such that
        no return value is required;
    */
    static void greet() {
        System.out.println("Hello Boy!" + "\nLet's add->");
    }
}