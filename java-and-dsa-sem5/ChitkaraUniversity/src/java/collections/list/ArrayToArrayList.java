package java.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToArrayList {
    public ArrayToArrayList() {
    }

    public static void main(String[] args) {
        String [] array = new String[] {"Steve", "Tim", "Lucy", "Pat", "Angela", "Tom"};

//        1. using Arrays.asList() method
        ArrayList <String> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list);
        System.out.println();

//        cannot use it directly
//        even if you try to typecast because it cannot be typecasted
//        ArrayList <String> list = (ArrayList<String>) Arrays.asList(array);
//        System.out.println(list);

//        2. using the Collections.addAll() method
        ArrayList <String> list2 = new ArrayList<>();
        Collections.addAll(list2, array);
//        list2.addAll(Arrays.asList(array));
        System.out.println(list2);

//        2. using the ArrayList.addAll() method
        ArrayList <String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(array));
        System.out.println(list3);
    }
}
