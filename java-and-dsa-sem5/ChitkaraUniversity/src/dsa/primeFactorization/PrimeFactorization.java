package dsa.primeFactorization;

public class PrimeFactorization {
    public static void printPrimeFactors(int number) {
        System.out.printf("Prime factors of %d:\n", number);
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                number /= i;
                if (number != 1) System.out.print(i + " x ");
                else System.out.print(i);
            }
        }
        System.out.println();
    }

    public static int getSumOfPrimeFactors(int number) {
        int sum = 0;
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                number /= i;
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        printPrimeFactors(20);
        printPrimeFactors(356);
        printPrimeFactors(400);
    }
}
