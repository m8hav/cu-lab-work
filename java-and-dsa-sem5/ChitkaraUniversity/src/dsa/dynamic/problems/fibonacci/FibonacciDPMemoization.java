package dsa.dynamic.problems.fibonacci;

/*
Memoization - Top-Down Approach

The memoized program for a problem is similar to the recursive version with a small modification that looks into a lookup table before computing solutions.
We initialize a lookup array with all initial values as NIL.
Whenever we need the solution to a subproblem, we first look into the lookup table.
If the precomputed value is there then we return that value, otherwise, we calculate the value and put the result in the lookup table so that it can be reused later.
 */

public class FibonacciDPMemoization {

    long[] cache;

    public FibonacciDPMemoization(int length) {
        cache = new long[length];
        for (int i = 0; i < length; i++)
            cache[i] = -1;
    }

    public long getFibonacciMemoization(int n) {
        if (cache[n] == -1) {
            if (n <= 1) cache[n] = n;
            else cache[n] = getFibonacciMemoization(n - 1) + getFibonacciMemoization(n - 2);
        }
        return cache[n];
    }

    public static void main(String[] args) {
        FibonacciDPMemoization obj = new FibonacciDPMemoization(1000);
        System.out.println("Fibonacci with DP - Memoization:");
        System.out.println("0 - " + obj.getFibonacciMemoization(0));
        System.out.println("1 - " + obj.getFibonacciMemoization(1));
        System.out.println("10 - " + obj.getFibonacciMemoization(10));
        System.out.println("30 - " + obj.getFibonacciMemoization(30));
        System.out.println("50 - " + obj.getFibonacciMemoization(50));
        System.out.println("500 - " + obj.getFibonacciMemoization(500));
        System.out.println();
    }
}
