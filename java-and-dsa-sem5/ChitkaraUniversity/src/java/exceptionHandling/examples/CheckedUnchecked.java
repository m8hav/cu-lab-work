package java.exceptionHandling.examples;

@SuppressWarnings("all")
class Checked {
//    Checked Example:
//    Exception and its subclasses (except RuntimeException and its subclasses) are all checked exceptions
//    they need to be handled for the program to be able to compile

//    public static void test() {
//        throw new Exception();
//    }
//  ^ requires us to handle it for the program to compile, so the code becomes:
    public static void test1() {
        try {
            throw new Exception();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
//  ^ handled using try catch block, or
    public static void test2() throws Exception {
        throw new Exception();
    }
//  ^ using throws declaration
}

@SuppressWarnings("all")
class Unchecked {
//  Unchecked Example:
    public static void test() {
        throw new RuntimeException();
    }
//  ^ doesn't require us to handle it for the program to compile
}

@SuppressWarnings("all")
public class CheckedUnchecked {
    public static void main(String[] args) {
        Checked checkedObj = new Checked();
        Unchecked uncheckedObj = new Unchecked();
    }
}