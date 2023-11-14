package _java.arrays;

//  Jagged Arrays
//      - also called Ragged Arrays
//      - Non-Rectangular Arrays
//      - member arrays can be of different lengths

import java.util.Arrays;

public class JaggedArrays {
    public static void main(String[] args) {
        // int [][] num = new int[5][5];
        // or
        // int [][] num = new int[5][];
        // or
        int [][] num;
        num = new int[5][];

        // num = new int[][5];
        // num = new int[][];
        // ^ can't do these
        // you either have to declare size of outer array
        // or you have to declare size of both outer and inner array
        // you can't leave the outer array's size empty
        // i.e. can't leave both inner and outer size empty
        // and can't just declare inner array's size and leave outer empty

        // since you're only required to declare outer array's size
        // inner array is declared and defined later manually
        // and is not created automatically

        for (int i = 0; i < num.length; i++) {
            num[i] = new int[5];
            if ((i & 1) == 1) Arrays.fill(num[i], 0, 3, i);
            else Arrays.fill(num[i], i);
        }

        num[0] = new int[]{1, 2};
        num[1] = new int[]{1, 2, 3};

        for (int[] a: num) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
