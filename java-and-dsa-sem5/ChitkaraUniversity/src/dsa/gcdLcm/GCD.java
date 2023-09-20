package dsa.gcdLcm;

public class GCD {
    public static int getGCDLoop(int numberOne, int numberTwo) {
        int remainder;
        while (numberOne % numberTwo != 0) {
            remainder = numberOne % numberTwo;

            numberOne = numberTwo;
            numberTwo = remainder;
        }
        return numberTwo;
    }

    public static int getGCDRecursion(int numberOne, int numberTwo) {
        if (numberTwo == 0) return numberOne;
        else return getGCDRecursion(numberTwo, numberOne % numberTwo);
//        20, 24
//        24, 20
//        20, 4
//        4, 0
    }

    public static int getGCDMultipleNumbers(int... numbers) {
        if (numbers == null || numbers.length == 0) return 0;
        int gcd = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            gcd = getGCDLoop(gcd, numbers[i]);
        }
        return gcd;
    }

    public static void main(String[] args) {
        System.out.println(getGCDLoop(20, 24));
        System.out.println(getGCDLoop(24, 20));
        System.out.println(getGCDLoop(13, 17));
        System.out.println();

        System.out.println(getGCDRecursion(20, 24));
        System.out.println(getGCDRecursion(24, 20));
        System.out.println(getGCDRecursion(13, 17));
        System.out.println();

        System.out.println(getGCDMultipleNumbers(20, 24, 2));
        System.out.println(getGCDMultipleNumbers(15, 20, 100));
        System.out.println(getGCDMultipleNumbers(13, 17, 19));
        System.out.println();
    }
}
