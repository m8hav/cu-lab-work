package dsa.greedy.problems;

/*
    Finding the minimum number of coins (or currency denominations)
    required to make change for a given amount of money.
 */

import java.util.Arrays;

public class CoinChange {
    public static int findMinimumCoins(int amount, int[] denominations) {

        // 1. sort the denominations in ascending order
        Arrays.sort(denominations);

        int coinCount = 0;
        int size = denominations.length;

        // 2. start from last denomination
        // keep checking if amount is divisible by denomination
        // keep subtracting the amount
        for (int i = size - 1; i >= 0; i--) {
            if (amount >= denominations[i])
                System.out.printf("%d coins of %d.\n", amount / denominations[i], denominations[i]);
            coinCount += amount / denominations[i];
            amount %= denominations[i];
        }

        return coinCount;
    }

    public static void main(String[] args) {
        int[] denominations = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000, 2000};

        System.out.println("87: " + findMinimumCoins(87, denominations));
        System.out.println();

        System.out.println("3986: " + findMinimumCoins(3986, denominations));
        System.out.println();

    }
}
