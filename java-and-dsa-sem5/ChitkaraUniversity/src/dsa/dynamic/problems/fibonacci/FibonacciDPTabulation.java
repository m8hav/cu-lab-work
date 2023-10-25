package dsa.dynamic.problems.fibonacci;

/*
Tabulation - Bottom-Up Approach

The tabulated program for a given problem builds a table in a bottom-up fashion and returns the last entry from the table.
For example, for the same Fibonacci number, we first calculate fib(0) then fib(1) then fib(2) then fib(3), and so on.
So literally, we are building the solutions to sub-problems bottom-up.

Better than old simple fibonacci approach
i.e. finding fibonacci with loop and using 2 variables and swapping
because swapping operation is costly

Ask Kaushal Sir:
Can't tabulation be made even better by Memoizing the values and retrieving in constant time later though?
    - yes, but only for this fibonacci question
    - there are other types of questions where there might be cases that might not be covered by memoization and tabulation would need to calculate those results anyway

 */

public class FibonacciDPTabulation {

    public long getFibonacciTabulation(int n) {
        long[] table = new long[n + 1];

        table[0] = 0;
        table[1] = 1;
        for (int i = 2; i <= n; i++) {
            // storing the results in table
            table[i] = table[i - 1] + table[i - 2];
        }
        return table[n];
    }

    public static void main(String[] args) {
        FibonacciDPTabulation obj1 = new FibonacciDPTabulation();
        System.out.println("Fibonacci with DP - Tabulation:");
        System.out.println("0 - " + obj1.getFibonacciTabulation(0));
        System.out.println("1 - " + obj1.getFibonacciTabulation(1));
        System.out.println("10 - " + obj1.getFibonacciTabulation(10));
        System.out.println("30 - " + obj1.getFibonacciTabulation(30));
        System.out.println("50 - " + obj1.getFibonacciTabulation(50));
        System.out.println("500 - " + obj1.getFibonacciTabulation(500));
        System.out.println();


        FibonacciDPMemoization obj2 = new FibonacciDPMemoization(1000);
        System.out.println("Fibonacci with DP - Memoization:");
        System.out.println("0 - " + obj2.getFibonacciMemoization(0));
        System.out.println("1 - " + obj2.getFibonacciMemoization(1));
        System.out.println("10 - " + obj2.getFibonacciMemoization(10));
        System.out.println("30 - " + obj2.getFibonacciMemoization(30));
        System.out.println("50 - " + obj2.getFibonacciMemoization(50));
        System.out.println("500 - " + obj2.getFibonacciMemoization(500));
        System.out.println();


//        System.out.println("Full Results in Table:");
//        obj.showResult();
    }
}
