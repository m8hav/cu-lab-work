package _java.iostreams.objectStreams;

import java.io.*;

public class ObjectStreams {
    public static void main(String[] args) {
        ObjectInputStream in = null;
        ObjectOutputStream out = null;

        String filePath = "IOFiles/ObjectStreams.txt";

//        Object being written needs to be Serializable
        Employee empObj = new Employee("BMMC-101", "Bart");

        try {
            out = new ObjectOutputStream(new FileOutputStream(filePath));
            in = new ObjectInputStream(new FileInputStream(filePath));

            out.writeObject(empObj);

            Object obj = in.readObject();

            Employee empObj2 = (Employee) obj;

            System.out.println("Employee ID: " + empObj2.getId());
            System.out.println("Employee Name: " + empObj2.getName());

        } catch (IOException e) {
            System.out.println("Exception occurred: " + e);
//            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
