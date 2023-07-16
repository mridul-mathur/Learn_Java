package Notes.Conditions_Loops;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        /*
        syntax-:
            if (bool exp 1) {
                //code
            }
            else if (bool exp 2) {
                //code
            }
            else {
                //code
            }
         */

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Salary :");
        int salary = in.nextInt();
        if (salary >= 20000) {
            salary += 2000;
        } else if (salary >= 10000) {
            salary += 3000;
        } else {
            salary += 5000;
        }
        System.out.println(salary);
    }
}
