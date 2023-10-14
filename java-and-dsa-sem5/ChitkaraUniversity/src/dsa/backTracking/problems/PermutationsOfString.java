package dsa.backTracking.problems;

public class PermutationsOfString {
    private static int permutationCount;

    private static void _printAllPermutations(String str, String permutationStr, int currentIndex) {
        if (str.length() == 0) {
            System.out.println(++permutationCount + ": " + permutationStr);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String newSubStr = str.substring(0, i) + str.substring(i + 1);

            _printAllPermutations(newSubStr, permutationStr + currentChar, currentIndex + 1);
        }
    }

    public static void printAllPermutations(String str) {
        System.out.println("All permutations of " + str + ":");
        permutationCount = 0;
        _printAllPermutations(str, "", 0);
        System.out.println(permutationCount + " total permutations.");
    }

    public static void main(String[] args) {
        printAllPermutations("bruh");
    }
}
