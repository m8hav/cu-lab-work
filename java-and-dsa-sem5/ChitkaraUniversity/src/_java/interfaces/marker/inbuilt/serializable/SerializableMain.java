package _java.interfaces.marker.inbuilt.serializable;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class SerializableMain {
    String filePath = "IOFiles/SerializedEmployeeData.txt";
    public void runProgram() {
//        SERIALIZATION
        try {
            Employee empObj = new Employee();

            empObj.setName("Bart");
            empObj.setId("BMM-101-475");

//            Settings Address of Employee Object
            Address addressObj = new Address("D-224", "Omicron-II", "Greater Noida", "UP", "201310");
            empObj.setAddress(addressObj);

            empObj.setPanCard("ABCDE1234F");
            empObj.setAadharCard("1234 5678 9012");

//            Printing data of employee object
            System.out.println(empObj.getInfo());

//            Creating stream and writing the object
            FileOutputStream fosObj = new FileOutputStream(filePath);
            ObjectOutputStream out = new ObjectOutputStream(fosObj);

            out.writeObject(empObj);
            out.flush();
            out.close();

            System.out.println("---Serialized---\n");

        } catch (Exception err) {
            System.out.println(err);
        }

//        DESERIALIZATION
        try {
//            Creating stream to read the object

            ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath));
//            ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get(outputFilePath)));

            Employee empObj = (Employee)in.readObject();

//            Printing data of new serialized object
            System.out.println(empObj.getInfo());
//            ^ panCard prints null because panCard field didn't get serialized


            in.close();

            System.out.println("---De-Serialized---\n");

        } catch (Exception err) {
            System.out.println(err);
        }
    }

    public static void main(String[] args) {
        SerializableMain obj = new SerializableMain();
        obj.runProgram();
    }
}
