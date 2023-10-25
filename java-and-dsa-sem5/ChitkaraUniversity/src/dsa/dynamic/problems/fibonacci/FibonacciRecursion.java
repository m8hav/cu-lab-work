package dsa.dynamic.problems.fibonacci;

public class FibonacciRecursion {

    public static long getFibonacciRecursion(long n) {
        if (n <= 1) return n;
        return getFibonacciRecursion(n - 1) + getFibonacciRecursion(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("FibonacciRecursion with Recursion:");
        System.out.println("N - Result");
        System.out.println("10 - " + getFibonacciRecursion(10));
        System.out.println("10 - " + getFibonacciRecursion(10));
        System.out.println("30 - " + getFibonacciRecursion(30));
        // fib for 50 takes very long with recursion
        // System.out.println("50 - " + fibonacciRecursion(50));
        System.out.println();
    }
}
