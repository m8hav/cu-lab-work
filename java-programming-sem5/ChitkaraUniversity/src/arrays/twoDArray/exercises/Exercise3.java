package arrays.twoDArray.exercises;

import java.util.Scanner;

public class Exercise3 {

    public Exercise3() {
        System.out.println("EXERCISE 3");
        System.out.println();

        int N;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter side of Square Array: ");
        N = scan.nextInt();
        System.out.println();
        System.out.println("Now enter values of the array: ");
        int[][] squareArr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                squareArr[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        // printing array
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(squareArr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

//        TASK 3 - FIND SUM OF ALL BORDER VALUES
        int sum1 = - squareArr[0][0] - squareArr[0][N-1] - squareArr[N-1][0] - squareArr[N-1][N-1];
        for (int i = 0; i < N; i++) sum1 += squareArr[0][i] + squareArr[N-1][i] + squareArr[i][0] + squareArr[i][N-1];
        System.out.println("Sum1: " + sum1);

        scan.close();
    }
}