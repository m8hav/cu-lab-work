package java.stringBuilder;

public class SBTest {
    public void runTest() {

//        STRING BUILDER WAS INTRODUCED IN JAVA 1.5
//        STRING BUILDER WAS RECOMMENDED OVER STRING BUFFER SINCE JAVA 1.5

//        STRING BUILDER IS NOT SYNCHRONISED WHILE MANY METHODS OF STRING BUFFER ARE SYNCHRONISED
//        SYNCHRONISED - WAIT IN EVENT QUEUE I.E. YOU CAN REALLY ONLY USE ONE THREAD

//        STRING BUILDER IS NOT THREAD-SAFE, STRING BUFFER IS THREAD-SAFE

//        STRING BUILDER IS FASTER THAN STRING BUFFER BECAUSE IT IS NOT SYNCHRONISED AND NOT THREAD-SAFE

//        BOTH HAVE AN INITIAL CAPACITY OF 16 CHARACTERS ON INITIALIZATION

        StringBuilder first;
        first = new StringBuilder();
        System.out.println("Value: " + first);
        System.out.println("Length: " + first.length());
        System.out.println("Capacity: " + first.capacity());
        System.out.println();

        first.insert(0, "Sample");
        System.out.println("Value: " + first);
        System.out.println("Length: " + first.length());
        System.out.println("Capacity: " + first.capacity());
        System.out.println();

//        IF YOU CREATE StringBuilder WITH NEW KEYWORD I.E. WITH STRING IN CONSTRUCTOR,
//        THEN LENGTH GETS ADDED TO INITIAL CAPACITY AND OBJECT STARTS WITH THAT CAPACITY
        System.out.println("=====CREATING ANOTHER STRING=====:");
        StringBuilder second = new StringBuilder("Solar System");
        System.out.println("Value: " + second);
        System.out.println("Length: " + second.length());
        System.out.println("Capacity: " + second.capacity());
        System.out.println();

//        WHEN LENGTH EXCEEDS CAPACITY, IMPLEMENTATION CHANGES CAPACITY AS:
//        new_capacity = (old_capacity*2)+2;

        second.insert(0, "Living ");
        System.out.println("Value: " + second);
        System.out.println("Length: " + second.length());
        System.out.println("Capacity: " + second.capacity());
        System.out.println();

        second.insert(0, "HUGE ");
        System.out.println("Value: " + second);
        System.out.println("Length: " + second.length());
        System.out.println("Capacity: " + second.capacity());
        System.out.println();

        second.insert(0, "HUMONGOUS ");
        System.out.println("Value: " + second);
        System.out.println("Length: " + second.length());
        System.out.println("Capacity: " + second.capacity());
        System.out.println();

        System.out.println(second.charAt(5));
    }
}
