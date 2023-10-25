package dsa.greedy.problems;

/*

    Approach 1:
    - only works for 1-digit numbers

    Sort the numbers in descending order

    Eg. 2 9 5 1 8
    Sorted: 9 8 5 2 1
    - correct answer

    But it won't work for 2-digit numbers.
    Eg. 2 9 32 1 8
    Sorted: 32 9 8 2 1
    - wrong
    Correct answer would be:
    9 8 32 2 1

    Approach 2:
    - works for multi-digit numbers as well

    Sort the numbers in descending order
    BUT using a custom comparator function

    Comparator function would be to concatenate two numbers as strings
    in 2 ways - first + second, and second + first
    and compare both on the basis of their integer values
    or on the basis of just strings directly
 */

import java.util.Arrays;

public class LargestNumberFromGivenSetOfNumbers {

    public static String findLargestNumber(int[] numbers) {
        // Convert numbers to strings for easy comparison
        String[] sArray = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++)
            sArray[i] = String.valueOf(numbers[i]);

        // Sort the string array using the compareTo as
        // (2, 12) -> 122.compareTo(212) = 212
        Arrays.sort(sArray, (num1, num2) -> Integer.valueOf((num2 + num1)).compareTo(Integer.valueOf(num1 + num2)));

        // (num2 + num1).compareTo(num1 + num2) does descending order
        // (num1 + num2).compareTo(num2 + num1) does ascending order

        // You can do compare Integer values of both
        // (num1, num2) -> Integer.valueOf((num2 + num1)).compareTo(Integer.valueOf(num1 + num2)));
        // or you can compare the strings directly as it works the same

        // Case when the largest number is 0
        if (sArray[0].equals("0"))
            return "0";

        // Concatenate the sorted strings to form the largest number
        StringBuilder largestNumber = new StringBuilder();

        for (String num : sArray)
            largestNumber.append(num);

        return largestNumber.toString();
    }

    public static void main(String[] args) {

        int[] numbers = {8, 2, 1, 32, 9};

        String largestNumber = findLargestNumber(numbers);
        System.out.println(largestNumber);

    }
}
