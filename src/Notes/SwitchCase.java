package Notes;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Fruit: ");
        String fruit = in.next();
        switch (fruit) {
            case "Mango" -> System.out.println("King");
            case "Apple" -> System.out.println("!Doctor");
            case "Banana" -> System.out.println("Tasty");
            default -> System.out.println("Enter valid fruit");
        }
    }
}
