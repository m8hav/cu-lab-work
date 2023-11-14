package _java.collections.set;

import java.util.*;

public class ReverseHashSetOrder {
    public static void main(String[] args) {

        // HashSet <Integer> hs = new HashSet<>(new ArrayList<>(Arrays.asList(3, 2, 6, 5, 4)));
        // ^ values automatically get sorted as soon as they're put in HashSet
        // no matter the method used to add values

        HashSet <Integer> hs = new LinkedHashSet<>(new ArrayList<>(Arrays.asList(3, 2, 6, 5, 4)));
        // so use Linked HashSet instead that preserves the order of elements

        for (Integer e : hs) {
            System.out.println(e);
        }
        System.out.println();

//        ArrayList can be used to reverse order of values
        ArrayList <Integer> list = new ArrayList<>(hs);
        ListIterator <Integer> it = list.listIterator(list.size());
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
        System.out.println();

        System.out.println(hs.toArray());
        System.out.println(Arrays.toString(hs.toArray()));

    }
}
