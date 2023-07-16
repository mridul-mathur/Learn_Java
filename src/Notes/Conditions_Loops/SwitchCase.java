package Notes.Conditions_Loops;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Fruit: ");
        String fruit = in.next();
        /*
        switch(expressions){
        case 1
            return;
        case 2
            return;
        }
         */

        System.out.println(switch (fruit) {
            case "Mango" -> "King";
            case "Apple" -> "!Doctor";
            case "Banana" -> "Tasty";
            default -> "Enter valid fruit";
        });

        //Nested Switch cases
        /*
         switch(expression){
            case 1 :
                switch(expression_2){
                    case 1 :
                        return;
                        break;
                    case 2 :
                        return;
                        break;
                }
            case 2 :
                return;
                break;
         }
         */

    }
}
