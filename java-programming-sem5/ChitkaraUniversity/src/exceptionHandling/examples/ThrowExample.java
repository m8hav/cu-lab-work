package exceptionHandling.examples;

public class ThrowExample {
    public void checkAge(int age) {
        if (age < 18) {
//            System.out.println("Sorry, you can't cast your vote yet.");
//            throw new ArithmeticException();
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else System.out.println("Access granted - You are old enough.");
    }
    public static void main(String[] args) {
//        int a = 5, b = 0;
//        System.out.println(a/b);

        ThrowExample obj = new ThrowExample();
        obj.checkAge(15);
    }
}
