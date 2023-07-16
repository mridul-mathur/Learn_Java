package Notes.Basics;

import java.util.Scanner;

public class Typecast {
    //When one type of data is assigned to another type of var then automatic type conversion will take place if the
    //following conditions are met -:
    //1)The two types should be compatible with each other;
    //2)The destination type should be grater than the source type(talking about byte space), for example(float->int,
    // int->float!, string->char, char->string!);
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        float num = get.nextInt();
        System.out.println(num);
        //Type casting is changing the larger to smaller type that can't be done automatically this type is also called
        // narrow casting;
        int num2 = (int) (23.125f);

        //automatic type promotion in expressions
        int a = 257;
        byte b = (byte) a; //max value that can be stored in a byte is 256;
        System.out.println(b);
        // output of b is 1, so it is giving 257 % 256 i.e. the remainder;
        byte c = 40;
        byte d = 50;
        byte e = 100;

        int f = (d * c) / e;
        System.out.println(f);
        // sout is 20;
        // c*d= 2000 then how is it able to store it in byte format??
        //the result of the intermediate term c * d exceeds the range of byte operand. To counter this problem java
        //automatically is promoting each byte to int while evaluating this expression i.e. the expression above is
        //performed using int even when it is in byte format;

        int number = 'A';
        System.out.println(number);
        // it is giving the value 65 even when we did char to int this is also example of automatic type conversion;
    }
}
