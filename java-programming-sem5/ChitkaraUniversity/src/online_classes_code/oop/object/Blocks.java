package online_classes_code.oop.object;

public class Blocks {

	public Blocks() {
		
		System.out.println("CONSTRUCTOR");
		
	}
	
	
	//init-block: just-a-block - RESPONSIBLE IN OBJECT WORLD
	{
	
		System.out.println("Just-A-Block");
		
	}
	
	
	//STATIC ANNONYMOUS BLOCK 
	//static-block comes first - RESPONSIBLE IN JVM WORLD
	static {
		
		System.out.println("Static-Block");
		
	}
	
	//static method
	static void staticMethod() {
		
		System.out.println("Static-Method");
		
	}
	
	
	//static-main method
	static public void main(String[] args) {
				
		//String message = "Hello World";
		//System.out.println(message);
		
		Blocks obj = new Blocks();				//the reference of a class by the constructor 
		
		//System.out.println("Object: " + obj);

		//obj.staticMethod();
		Blocks.staticMethod();
		
	}
	
}
