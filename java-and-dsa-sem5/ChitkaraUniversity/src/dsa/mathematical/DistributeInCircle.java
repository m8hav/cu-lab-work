package dsa.mathematical;

public class DistributeInCircle {

//    you have a given number of nodes in a circle, and you have to distribute a given number of items to them in a circular motion one at a time. You are also given a starting position.
//    Now find the last node that will get the item.

    public static int getEndingPosition (int numberOfItems, int numberOfNodes, int startingNode) {
        int endingPosition = ((numberOfItems + startingNode - 1) % numberOfNodes);
        return endingPosition == 0 ? numberOfNodes : endingPosition;
    }

    public static void main(String[] args) {
        System.out.println(getEndingPosition(20, 7, 1));
        System.out.println(getEndingPosition(20, 7, 3));
        System.out.println(getEndingPosition(101, 11, 1));
        System.out.println(getEndingPosition(101, 11, 11));
    }
}
