package java.generics.genericBox.example1;

public class GBMain {
    public static void main(String[] args) {
        GenericBox<String> stringGenericBox = new GenericBox<>();
        GenericBox<Integer> integerGenericBox = new GenericBox<>();

        stringGenericBox.set(new String("bruh"));
//        stringGenericBox.set("bruh");     // it would still work
//        setting primitive types directly would still be set as a wrapper class object in the instance
//        primitive type is automatically converted to the wrapper classes object (basic wrapper class property)
//        but to remember and make a habit, it's better to use wrapper classes when setting values
        System.out.println(stringGenericBox.get());

//        stringGenericBox.set(new Integer(100));
//        ^ gives error since the collection is of type String and value is of type Integer

        integerGenericBox.set(100);
        System.out.println(integerGenericBox.get());
    }
}
