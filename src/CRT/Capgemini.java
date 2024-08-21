package CRT;

import java.util.Scanner;

public class Capgemini {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter no of semester: ");
        int numbers = scanner.nextInt();

        int[] subjects = new int[numbers];
        for (int i = 0; i < numbers; ++i) {
            System.out.print("Enter No of Subjects in " + (i + 1) + " Semester: ");
            subjects[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers; ++i) {
            int max = 0;
            System.out.print("Marks obtained in semester " + (i + 1) + ": ");
            while (subjects[i] != 0) {
                int temp = scanner.nextInt();
                if (temp <= 100) {
                    if (temp > max) max = temp;
                    --subjects[i];
                } else {
                    System.out.println("You have entered an invalid mark.");
                    System.out.print("Enter Marks again: ");
                }
            }
            subjects[i] = max;
        }

        for (int i = 0; i < numbers; ++i) {
            System.out.println("Maximum mark in " + (i + 1) + " semester: " + subjects[i]);
        }
    }
}
