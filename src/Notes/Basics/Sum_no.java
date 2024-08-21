package Notes.Basics;

import java.util.Scanner;

public class Sum_no {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("first no.: ");
        float num1 = get.nextFloat();
        System.out.println("second no. : ");
        float num2 = get.nextFloat();

        float sum = num1 + num2;

        System.out.println("the sum of the numbers is " + (double) sum);
    }
}
