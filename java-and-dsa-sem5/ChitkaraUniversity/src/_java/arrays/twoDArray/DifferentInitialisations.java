package _java.arrays.twoDArray;

public class DifferentInitialisations {
    public static void main(String[] args) {
        // for 1D array
        int [] arr = {1, 2, 3, 4, 5};

        int[][] exampleArr1;
        int[][] exampleArr2 = new int [5][];
        int[][] exampleArr3 = new int [5][5];

//        initialization and declaration of jagged/ragged array
        int[][] exampleArr4 = {{1, 2, 3, 4}, {5, 6}, {7, 8, 9}, {10}};

        int[][] exampleArr5 = new int[][]{
                {1, 2, 3},
                {3, 4, 5, 6, 7}
        };
    }
}
