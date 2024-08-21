package Notes.OOPS_Concepts;

public class Main {
    public static void main(String[] args) {

        int[] Roll_no = new int[5];
        String[] names = new String[5];
        float[] marks = new float[5];

        // data of 5 students : {roll_no, names, marks)
        // if you want to store every single element that contains these 3 constraints
        // class is a named grouped of properties and functions
        // you can create your own data type like-: Student[] std = new Student[5];

        Car car1 = new Car("Ferrari", "Sports", 350.4f, 2);
        // creating a new object
        // the 'new' keyword dynamically allocates the memory and allocates a reference
        // variable to the object.

        Car car2 = new Car();

        // the declaration is done at the compile time and the object is created at the
        // runtime and the allocation of memory is also done at the runtime.

        System.out.print(car1.name + " ");// print null
        System.out.print(car1.top_speed + " ");
        System.out.print(car1.seats + " ");
        System.out.println(car1.type);

        // but if we define a default value to it in the class where we have declared it
        // It will return a default value if the value is not defined. actually if we don't
        // give a default value then it is automatically null value in the memory for string
        // for int and float the value initially is 0.

        car2.name = "BMW";
        car2.top_speed = 240.402;
        System.out.println(car2.name + " -> top_speed: " + car2.top_speed);
        Car car3 = new Car();
        car3 = car2;
        // here a copy is not made actually now in the memory car3 is also pointing to
        // the same object in the memory as the car 2;
        car3.name = "abcd";// changes the value of car2 name

        System.out.println(car2.name);// prints -> "abcd"
    }
    /*
    A class is like a template that a structure must have these properties
    An object is the instance of a class or like a representation of that class
    which contains the properties and functions that can be called later.
    these properties of a object is called as instance variables.

    for example-: a car can be a class with properties like engine, seats , type
    =>  Car1-> name: Ferrari, type: Sports, top_speed: 430.50, seats: 2
    =>  Car2-> name: Hummer, type: SUV, top_speed: 210.75, seats: 7
    =>  Car3-> name: BMW, type: Sedan, top_speed: 250.25, seats: 4

    here we consider a class Car with different properties like name, type, ts, seats where
    you can create various cars but must have these basic properties, but different cars
    can have different values of these properties.
    so these name like car1,2,3 are objects of a class i.e. AKA instances of
    a class with datatype car.

    Classes -: Logical Construct | Objects -: Physical stuff that occupy space in memo

    now we know that every class will have these properties but how are these accessed?
    if we have car1, car2, car3 and the properties mentioned above, we use the (.) dot
    operator to access these properties.

    how to do this-:

    Car car1 = new Car();

    car1.name = "ferrari"
    car1.type = "Sports"......and so on.

    here the dot operator helps us to access the instance variables of instance car1 of
    class Car.
     */

    private static class Car {
        String name;
        String type;
        double top_speed;
        int seats = 1;

        // Car(); this is a constructor.
        // a constructor defines what happens when a object is being created.
        // you can directly give values inside the constructor so that don't have to use
        // the car3.name...car3.name again and again
        // constructor is a special type of function in a class with the same name as
        // the class. The default constructor car(); is called when we do not define constructor
        // manually which is an empty constructor. and you have to define all value explicitly.
//        Car() {
//            this.name = "";
//            this.seats = 0;
//            this.type = "";
//            this.top_speed = 0.0F;
//        }

        Car() {
            this("TATA", "HatchBack", 21F, 5);
            // internally : new Car("TATA", "HatchBack", 21F, 5);
        }

        Car(String name, String type, float top_speed, int seats) {
            // this is replaced when ever we declare a object like car1.
            //then 'this' is replaced and values are allotted to the object in the memory itself.
            // and internally it is stored  as car1.top_speed=13; car1.type=sedan ....etc
            // 'this' means what object you are referring to.
            this.top_speed = top_speed;
            this.type = type;
            this.name = name;
            this.seats = seats;
        }
        // this is called as constructor overloading where we have 2 constructors but with
        // different parameters passed in it. -> this is a part of polymorphism.

        void greeting() {
            System.out.println("Hello, " + this.name + "! Let's go for a ride.");
        }
        // call a constructor with another constructor

    }
    /*
    so if we create a car just by constructing it and not giving the instance variables a
    value then it will contain NULL in the beginning.
    */
}
