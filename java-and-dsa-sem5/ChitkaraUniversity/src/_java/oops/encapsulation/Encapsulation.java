package _java.oops.encapsulation;

public class Encapsulation {
    int serialNo;
    //	Default Constructor (No-Argument Constructor) - Not Mandatory
    public Encapsulation() {
        serialNo = 10;
        System.out.println("Serial No. inside constructor: " + serialNo);
        System.out.println("Serial No. inside constructor: " + ++serialNo);
    }
    public void method() {
        System.out.println("Serial No. inside method: " + serialNo);
    }
    static void staticMethod() {
        System.out.println("inside static method");
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();

        obj.method();
        staticMethod();
        Encapsulation.staticMethod();   // same as above
        // Can access static methods without referencing class

        System.out.println(obj.serialNo);
    }
}
