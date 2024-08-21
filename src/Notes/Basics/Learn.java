package Notes.Basics;/* the folder in which the java file lies;
it is important as sometimes we need to provide some rules
or properties or methods that we want to be accessed by
only the files in this package; */

import java.util.Scanner;
/* importing the scanner class that is public in jdk that is
public, and we are using it; */

public class Learn {
    /* public means this class can be accessed from anywhere;
    class is just main group of properties and methods;
    the name of the file must be of the same name as the
    main public class; */

    public static void main(String[] args) {
        /* main is actually a reserved name of a method it has to be main;
        if there will be no main function then the code won't work as it
        is the entry point of the program;
        public makes the main method to be available to be executed from
        anywhere;
        as it won't make sense if the main method can't be accessed from
        anywhere;
        static keyword helps the main method to run without any objects too;
        as main method is the entry point of code => no object was created
        before it, so it must run even when there is no given object;
        void is the data return type which implies that no return is required;
        string[] is an array, args is the command line argument;
        whatever command is given in the terminal as an array it will be
        stored in this variable; */

//      System.out.print("Hello World!");
//      System.out.println("My name is Mridul");
        /* System is also a class ,which contains several useful methods and
        println is a method of it that is prints the string which is inputted;
        out is the variable that is a type of print-stream. where print-stream
        adds functionality to another standard output stream that prints
        representation of various data values;
        if we remove ln them the next one will run in the same line; */

//        Scanner input1 = new Scanner(System.in);
//        System.out.println(input1.nextInt());
        /*.in represents standard input stream ;
        input var of type scanner;
        new keyword is creating a new object;
        nextInt() will input the integer;
        next() will input the string till it finds the space;
        for entire line nextLine() is used;*/

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Roll no.");
        int roll_no = input.nextInt();
        System.out.println("roll no.:" + roll_no);

        System.out.print("Enter your Name:");
        String naam = input.next();
        System.out.println("Name :" + naam);


        System.out.print("Enter your marks");
        float marks = input.nextFloat();
        System.out.println("Marks :" + marks);

        float percentage = (marks / 500) * 100;
        if (percentage > 100) {
            System.out.println("Enter valid marks");
        } else {
            System.out.println("percentage :" + percentage);
        }
    }
}