package dsa.recursion.towerOfHanoi;

public class TowerOfHanoi {

    public static void moveDisks(int n, char fromRod, char toRod, char auxRod) {
        if (n == 1) {
            System.out.printf("Move disk %d from rod %c to rod %c.\n", n, fromRod, toRod);
            return;
        }
        moveDisks(n - 1, fromRod, auxRod, toRod);
        System.out.printf("Move disk %d from rod %c to rod %c.\n", n, fromRod, toRod);
        moveDisks(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        moveDisks(4, 'A', 'C', 'B');
    }
}