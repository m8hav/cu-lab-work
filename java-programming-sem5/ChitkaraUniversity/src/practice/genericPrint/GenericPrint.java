package practice.genericPrint;

import java.util.ArrayList;
import java.util.List;

public class GenericPrint {

//    public static <T> void print(String sep, String end, T... values) {
    public static <T> void print(T... values) {
//        if (sep == null) sep = " ";
//        if (end == null) end = "\n";
        if (values.length > 0) {
            for (int i = 0; i < values.length - 1; i++)
                System.out.print(values[i] + " ");
            System.out.print(values[values.length - 1]);
        }
        System.out.println();
    }

//    public static <T> void print(T... values) {
//        print(" ", "\n", values);
//    }
//
//    public static <T> void print(String arg, boolean sep, T... values) {
//        if (sep) print(arg, null, values);
//        else print(null, arg, values);
//    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(200);

        Employee emp = new Employee(123, "Bart", "Bart", 40000.00);

        Object[] values = {"first", true, 199, "bruh", list, emp};

        print(values, emp , "first", true, 199, "bruh", list, emp);
        print();
        print("first", true, 199, "bruh", list, emp);


    }
}
