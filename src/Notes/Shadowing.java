package Notes;

public class Shadowing {

    int a;// this has its own scope
    // to use this var we have to add static to it.
    static int b = 40;
    public static void main(String[] args) {
       //a=10; this will give error.
        System.out.println(b);//40
        int b;
        // scowhen value is will begin when value is initialize.
        b = 20;
        System.out.println(b);//20
        //shadowing in java is using 2 class vars with same
        //name within the scope that overlaps the value.
        fun();
    }
    static void fun(){
        System.out.println(b);
    }
}
