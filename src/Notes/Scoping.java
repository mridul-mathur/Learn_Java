package Notes;

public class Scoping {
    public static void main(String[] args) {
        //Scope means where we can access our variables

        /* 1. Method scope
        a variable inside a function can only be accessed
        within the function by default and that is also true
        for all the arguments. And changes made to them will
        only be valid inside the function scope only.
         */
        int a = 10;
        int b = 20;
        // System.out.println(num); this will give an error

        /*
            2. Block Scope
            a variable initialized within a block can't be
            accessed outside the block
         */
        {
            //int a = 78;the var initialized outside the block
            //can't be accessed inside.
            int c = 99;
            a = 78;
            System.out.println("a= " + a);//this will print 78 only inside
            //the block, else 10 will be printed.
        }

        // System.out.println(c); This will give a error

        // 3. Loop Scoping

        for (int i = 0; i < 4; i++) {
            int num = 40;
            //int a = 20; a is already defined so this will give error.
            // i have to be initialized again outside the block
        }

    }

    /*static int sum(a,b) { This will show an error cuz a,b
        int num = a+b;       are not defined inside function.
        return num;
    }
     */
    static int sum (int a , int b){
        int num = a+b;
        return num;
    }
}
