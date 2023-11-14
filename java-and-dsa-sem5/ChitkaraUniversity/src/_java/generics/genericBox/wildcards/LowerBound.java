package _java.generics.genericBox.wildcards;

import java.util.ArrayList;
import java.util.List;

public class LowerBound {
    public LowerBound() {
    }

    public void printData (List<? super Integer> numbers) {
//        only allows List of type Integer and its supertypes like Number and Object
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
        LowerBound obj = new LowerBound();

        List<Integer> iList = new ArrayList<>();
        iList.add(100);
        iList.add(200);
        iList.add(300);
        obj.printData(iList);

//        Doesn't allow Double because it's not a supertype of Integer
        /*
//        For Double
        List<Double> dList = new ArrayList<>();
        dList.add(100);
        dList.add(200);
        dList.add(300);
        obj.printData(dList);
        */
    }
}
