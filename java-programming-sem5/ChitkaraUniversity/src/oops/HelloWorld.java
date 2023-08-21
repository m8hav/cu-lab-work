package oops;

public class HelloWorld {


    //	initialization block. Called in order of appearance when object is instantiated
    //	It is run even before the constructor
    {
        System.out.println("in object initialization block 1");
    }

    //	Static initialization block. Called when class is loaded, in order of appearance
    //	It is run even before the main method
    static {
        System.out.println("in static class initialization block 1");
    }

    public HelloWorld(int a) {
        int z = a;
        System.out.println("in the constructor with value " + a);
    }

    //	initialization block. Called in order of appearance when object is instantiated
    //	It is run even before the constructor
    {
        System.out.println("in object initialization block 3");
    }

    static void staticMethod() {
        System.out.println("in new static method");
    }

    void newMethod() {
        System.out.println("in new method");
    }

    //	initialization block. Called in order of appearance when object is instantiated
    //	It is run even before the constructor
    {
        System.out.println("in object initialization block 2");
    }

    public static void main(String[] args) {
        System.out.println("in static void main method");

//		String message = "bruh";
//		System.out.println(message);

        int i = 10;

//		Can't instantiate custom-made objects implicitly
//		HelloWorld obj(10);
//		Have to instantiate them explicitly
        HelloWorld obj = new HelloWorld(10);
//		or
        HelloWorld obj2;
        obj2 = new HelloWorld(5);

//		System.out.println(obj);

//		Static methods can be called directly or by referencing class. i.e.
        staticMethod();
//		or
        HelloWorld.staticMethod();

        obj.newMethod();
    }

    //	Static initialization block. Called when class is loaded, in order of appearance
    //	It is run even before the main method
    static {
        System.out.println("in static class initialization block 2");
    }

}
