package java.generics.genericBox.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Unbounded <T> {
    public Unbounded() {
    }
    public void printData (List<?> numbers) {
//        allows List of any type
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
        Unbounded obj = new Unbounded();

        //For Integer
        List<Integer> iList = new ArrayList<>();

        iList.add(100);
        iList.add(200);
        iList.add(300);

        obj.printData(iList);


        //For String
        List<String> sList = new ArrayList<>();

        sList.add("Tim");
        sList.add("Tom");
        sList.add("Tum");

        obj.printData(sList);
    }
}
