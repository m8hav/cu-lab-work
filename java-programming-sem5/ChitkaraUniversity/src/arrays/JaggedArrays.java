package arrays;

//  Jagged Arrays
//      - also called Ragged Arrays
//      - Non-Rectangular Arrays
//      - member arrays can be of different lengths

import java.util.Arrays;

public class JaggedArrays {
    public static void main(String[] args) {
        int [][] num;
        num = new int[5][];

        for (int i = 0; i < num.length; i++) {
            num[i] = new int[5];
            if ((i & 1) == 1) Arrays.fill(num[i], 0, 3, 1);
            else Arrays.fill(num[i], 2);
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
