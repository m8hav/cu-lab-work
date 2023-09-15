package practice.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        // Scanner scan = new Scanner(System.in);
        // System.out.println(calc.performOperation(10, 5, '+'));
        // System.out.println(calc.solveExpression("1  + 2 +    3  "));
//        System.out.println(calc.solveExpression("1 * 2 / 3 + 4 - 5")); // - 0.3333334
//        solveExpressionStrict only works if you separate operators and operands with spaces
        System.out.println(calc.solveExpressionStrict("11 * 22 / 33 + 44 - 55"));
//        solveExpression should work freely with or without spaces but doesn't work yet.
        //        System.out.println(calc.solveExpression("11 * 22 / 33 + 44 - 55"));
        // System.out.println(calc.solveExpression(scan.nextLine()));
        // scan.close();
    }
}
