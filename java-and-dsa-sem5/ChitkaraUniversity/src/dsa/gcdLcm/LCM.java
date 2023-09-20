package dsa.gcdLcm;

import java.util.Arrays;

public class LCM {
    public static int getLCM(int numberOne, int numberTwo) {
        return (numberOne * numberTwo) / GCD.getGCDRecursion(numberOne, numberTwo);
    }

    public static int getLCMMultipleNumbers(int... numbers) {
//        NOT DONE YET

        return Arrays.stream(numbers).reduce(1, (a, b) -> a * b) / GCD.getGCDMultipleNumbers(numbers);
//        if (numbers == null || numbers.length == 0) return 0;
//        int multiple = 1;
//        for (int number : numbers) multiple *= number;
//        return multiple / GCD.getGCDMultipleNumbers(numbers);
    }

    public static void main(String[] args) {
        System.out.println(getLCM(20, 24));

        System.out.println(getLCMMultipleNumbers(20, 24));
        System.out.println(getLCMMultipleNumbers(20, 24, 4));
        System.out.println(getLCMMultipleNumbers(20, 15, 100));
    }
}
