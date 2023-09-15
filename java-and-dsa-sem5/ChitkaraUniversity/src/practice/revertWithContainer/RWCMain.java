package practice.revertWithContainer;

public class RWCMain {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 3, 2, 1};

        RevertWithContainer obj = new RevertWithContainer();
        obj.createArray();
        obj.displayArray();

        obj.reverseUsingContainer();
        obj.displayArray();

        obj.doSort();
        obj.displayArray();

        obj.reverseUsingContainer();
        obj.displayArray();
    }
}
