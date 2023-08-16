package interfaces.marker.inbuilt.serializableTrainersCode;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {


		//Serialization
		try{    

			Employee obj = new Employee();  
			
			obj.getSerial_no();

			obj.setId("DEV-01-11011");
			obj.setName("Tim");
			
			//houseNo, sector, city, state, pincode
			Address objAddress = new Address("D-224", "Omicron-II", "Greater Noida", "UP", "201310" );
			obj.setAddress(objAddress);
			
			obj.setPancard("1234567890");
			obj.setAadharcard("abcdef123456");
			
			
			
			
			//Creating stream and writing the object    
			FileOutputStream fosObject = new FileOutputStream("EmployeeData.CreatePath");
			
			ObjectOutputStream out = new ObjectOutputStream(fosObject);    
			
			out.writeObject(obj);  
			
			out.flush();    
			out.close();    
			
			System.out.println("Serialized...");    
			
		}catch(Exception e){
			
			System.out.println(e);
		
		}    


		

		//Deserialization
		try{

			//Creating stream to read the object
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("EmployeeData.CreatePath"));

			Employee obj = (Employee)in.readObject();

			//printing the data of the serialized object
			System.out.println(obj.getSerial_no());
			System.out.println(obj.getId());
			System.out.println(obj.getName());
			System.out.println(obj.getAddress().toString());
			System.out.println(obj.getPancard());
			System.out.println(obj.getAadharcard());


			in.close();

			System.out.println("De-Serialized...");

		}catch(Exception e){

				  System.out.println(e);
		}
		
	
	}

}
