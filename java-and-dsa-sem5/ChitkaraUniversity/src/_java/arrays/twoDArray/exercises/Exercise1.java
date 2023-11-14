package _java.arrays.twoDArray.exercises;

import java.util.Scanner;

public class Exercise1 {

    public Exercise1() {
        System.out.println("EXERCISE 1");
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

        scan.close();
    }
}