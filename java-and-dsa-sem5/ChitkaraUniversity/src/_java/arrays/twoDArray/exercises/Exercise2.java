package _java.arrays.twoDArray.exercises;

import java.util.Scanner;

public class Exercise2 {

    public Exercise2() {
        System.out.println("EXERCISE 2");
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
                System.out.print(squareArr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

//        TASK 1 - FIND CENTER VALUE
        int center = squareArr[N/2][N/2];
        System.out.println("Center: " + center);
        System.out.println();

//        TASK 2 - MAKE DIAGONALS EQUAL TO CENTER VALUE - X-MEN QUESTION
        for (int i = 0; i < N; i++) {
            squareArr[i][i] = center;
            squareArr[i][N-1-i] = center;
        }
        // printing array
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(squareArr[i][j] + "\t");
            }
            System.out.println();
        }

        scan.close();
    }
}