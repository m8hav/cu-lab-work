package online_classes_code.oop.encapsulation;

/*
 * Encapsulation: To wrap-up the fields and methods together.
 * 
 */
public class Encapsulation {
	
	int serialNo;	//instance variables
	

	//No-Argumented Constructor - Default Constructor - It's not required.
	/*
	public Encapsulation() {
		
		serialNo = 10;
		
		//System.out.println("Serial No. " + serialNo); //10
		//System.out.println("Serial No. " + ++serialNo); //11

		//System.out.println("Serial No. " + (1 + serialNo)); //12
		//System.out.println("Serial No. " + (serialNo + 1)); //12
		
	}
	*/
	
	/*
	public Encapsulation(int serialNo) {
	
	}
	*/
	
	
	
	
	public void Method() {
		
		System.out.println("Serial No. - " + serialNo);	//11	
		
	}
	
	
	//Setters and Getters
	/**
	 * @return the serialNo
	 */
	public int getSerialNo() {
		return serialNo;
	}


	/**
	 * @param serialNo the serialNo to set
	 */
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	
	
	
	
	/*
	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation();	
		
		
		//obj.serialNo = 25;
		
		//An object is a real time entity to access everything from the class it belong to. 
		//System.out.println(obj.serialNo);
		
		obj.Method();
		
		
	}
	*/


}
