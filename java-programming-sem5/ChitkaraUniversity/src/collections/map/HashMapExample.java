package collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public HashMapExample() {
    }

    public static void main(String[] args) {
        HashMap<Integer, String> data = new HashMap<>();

//        Add or update values : put()
        data.put(101, "Mercury");
        data.put(102, "Venus");
        data.put(103, "Earth");
        data.put(104, "Mars");
        data.put(105, "Jupiter");
        data.put(106, "Saturn");
        data.put(107, "Uranus");

        data.put(108, "Pluto");
//        ^ wrong input can be updated by using put() method on the same key again
        data.put(108, "Neptune");

//        Get Size
        System.out.println("Size of HashMap: " + data.size() + '\n');

//        Get value using key
        System.out.println("Value at key 103: " + data.get(103) + '\n');

//        Check if HashMap contains key
        System.out.println("Does key 103 exist: " + data.containsKey(103) + '\n');

//        Remove key - automatically removes value as well
        System.out.println("Removing key 103: " + data.remove(103));
        System.out.println("Checking if key 103 exists now: " + data.containsKey(103) + '\n');

//        Ways to print values from a map:
//        1. print statement
//        2. entrySet() method
//        3. keySet() method
//        4. values() method
//        5. forEach loop - with Lambda Expression

//        1. print statement
        System.out.println("----------------------------------------\n");
        System.out.println("Printing using print statement:");
        System.out.println(data);
        System.out.println();
//        System.out.println(data.toString() + '\n');

//        2. entrySet() method - finest way to print
        System.out.println("----------------------------------------\n");
        System.out.println("Printing using entrySet() method:");
        for (Map.Entry<Integer, String> entry : data.entrySet()) {
            System.out.println("entry: " + entry);
            System.out.println("key and value manually: " + entry.getKey() + " - " + entry.getValue());
            System.out.println(entry.getClass());
        }
        System.out.println(data.entrySet());
        System.out.println(data.entrySet().getClass());
        System.out.println();

//        3. keySet() method
        System.out.println("----------------------------------------\n");
        System.out.println("Printing using keySet() method:");
        for (Integer key : data.keySet()) {
            System.out.println(key + " - " + data.get(key));
        }
        System.out.println(data.keySet());
        System.out.println(data.keySet().getClass());
        System.out.println();

//        4. values() method
        System.out.println("----------------------------------------\n");
        System.out.println("Printing using values() method - to only print values:");
        for (String value : data.values()) {
            System.out.println(value);
        }
        System.out.println(data.values());
        System.out.println();

//        5. forEach loop - with Lambda Expression
        System.out.println("----------------------------------------\n");
        System.out.println("Printing using forEach loop - with Lambda Expression:");
        data.entrySet().forEach(entry->{
            System.out.println(entry);
            System.out.println(entry.getKey() + " - " + entry.getValue());
        });
        System.out.println();


//        Getting hashcode
        Integer oneKey = 103;
        System.out.println(data.get(oneKey).hashCode());

    }
}
