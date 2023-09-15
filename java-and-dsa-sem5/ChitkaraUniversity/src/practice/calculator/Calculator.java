package practice.calculator;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Stream;

public class Calculator {
    public double performOperation(double a, double b, char op) {
        switch (op) {
            default: return 0;
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return b == 0 ? 0 : a / b;
        }
    }

    public double solveExpressionStrict(String expression) {

        String [] expParts = expression.trim().split("\\s+");

        Stack <String> expStack = new Stack<>();

        if ((expParts.length & 1) == 0) return 0;
        for (int i = expParts.length - 1; i >= 0; i--) {
            expStack.push(expParts[i]);
        }

        double res = 0, operand1, operand2;
        char operator;
        while (expStack.size() > 1) {
            operand1 = Double.parseDouble(expStack.pop());
            operator = expStack.pop().charAt(0);
            operand2 = Double.parseDouble(expStack.pop());
            expStack.push(String.valueOf(performOperation(operand1, operand2, operator)));
        }
        return Double.parseDouble(expStack.pop());
    }

    public double solveExpression(String expression) {
        String [] operands = expression.trim().split("[\\s*+-/]");
        for (String s : operands) System.out.println(s);

//        Stack <String> another = new Stack<>();
//        String [] operators = expression.trim().split("[0-9\\s]");
//        operators = (String[]) operators.filter(x -> ! x.equals("")).toArray();
////        for (int i = 0; i < operators.length; i++) operators[i] = operators[i].trim();
//        for (String s : operators) System.out.println(s);
//        System.out.println(operators.length);
        return 0;
        /*if ((parts.length & 1) == 0) return 0;
        Stack <Double> operandStack = new Stack<Double>();
        Stack <String> operatorStack = new Stack<String>();
        for (int i = parts.length - 1; i >= 0; i--) {
            expStack.push(parts[i]);
        }
        double res = 0, operand1, operand2;
        char operator;
        while (expStack.size() > 1) {
            operand1 = Double.parseDouble(expStack.pop());
            operator = expStack.pop().charAt(0);
            operand2 = Double.parseDouble(expStack.pop());
            expStack.push(String.valueOf(performOperation(operand1, operand2, operator)));
        }
        return Double.parseDouble(expStack.pop());

         */
    }
}
