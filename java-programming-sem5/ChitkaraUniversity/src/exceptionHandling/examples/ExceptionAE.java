package exceptionHandling.examples;

public class ExceptionAE {
    public static void main(String[] args) {
        int a = 30, b = 0;
//        if (b != 0) {
//            int c = a / b;
//        }
        try {
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException aex) {
            System.out.println("Can't divide a number by 0");
            System.out.println();
        } catch (Exception ex) {
            System.out.println("Exception");
        } finally {
            for (int i = 0; i < 10; i++) {
                if ((i & 1) == 1) System.out.println("Inside Aayush");
                else System.out.println("Outside Aayush");
            }
        }
        System.out.println("\nAayush is satisfied...\n");
        System.out.println("Outside Aayush");
    }
}
