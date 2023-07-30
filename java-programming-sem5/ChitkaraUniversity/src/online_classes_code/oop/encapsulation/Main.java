package online_classes_code.oop.encapsulation;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		
		int serialNo = 100;
		Encapsulation obj = new Encapsulation();	
		
		
		obj.serialNo = 25;
		
		//An object is a real time entity to access everything from the class it belong to. 
		System.out.println(obj.serialNo);
		
		obj.Method();
		
		
	}

}
