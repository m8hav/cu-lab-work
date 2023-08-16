package interfaces.marker.inbuilt.serializable;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class SerializableMain {
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
            System.out.println(empObj.getSerialNo());
            System.out.println(empObj.getId());
            System.out.println(empObj.getName());
            System.out.println(empObj.getPanCard());
            System.out.println(empObj.getAadharCard());
            System.out.println(empObj.getAddress().toString());

//            Creating stream and writing the object
            FileOutputStream fosObj = new FileOutputStream("IOFiles/EmployeeData.CreatePath");
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

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("IOFiles/EmployeeData.CreatePath"));
//            ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get("IOFiles/EmployeeData.CreatePath")));

            Employee empObj = (Employee)in.readObject();

//            Printing data of new serialized object
            System.out.println(empObj.getSerialNo());
            System.out.println(empObj.getId());
            System.out.println(empObj.getName());
            System.out.println(empObj.getPanCard());
//            ^ prints null because panCard field didn't get recognized
            System.out.println(empObj.getAadharCard());
            System.out.println(empObj.getAddress().toString());

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
