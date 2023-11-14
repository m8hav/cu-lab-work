package _java.generics.genericBox.wildcards;

import java.util.ArrayList;
import java.util.List;

public class UpperBound {
    public UpperBound() {
    }

    public void printData (List<? extends Number> numbers) {
//        only allows List of type Number and its subtypes
        int counter = 0;
        for (Object obj : numbers) {
            counter++;
            if (counter/2 == 0)
                System.out.print(obj);
            else
                System.out.println(" - " + obj);
        }
    }
    public static void main(String[] args) {
        UpperBound obj = new UpperBound();

        List<Integer> iList = new ArrayList<>();
        iList.add(100);
        iList.add(200);
        iList.add(300);
        obj.printData(iList);

//        For Double
        List<Double> dList = new ArrayList<>();
        iList.add(100);
        iList.add(200);
        iList.add(300);
        obj.printData(iList);


//        Doesn't accept strings because it's not a subtype of Number
        /*
        //For String
        List<String> sList = new ArrayList<>();

        sList.add("Tim");
        sList.add("Tom");
        sList.add("Tum");

        obj.printData(sList);
        */

    }
}
