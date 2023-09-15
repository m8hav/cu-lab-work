package java.online_classes_code.oop.inheritance.multilevel;

import java.util.Scanner;



/*
 * Grandparent bought a car 					- HONDA / REGISTRATION
 * Father got this car from his father 			- RE-REGISTRATION
 * Salary got this same car from his father 		- MODIFIED
 * 
 */


public class Main {

	public static void main(String[] args) {

		Scanner _input = new Scanner(System.in);
		
		System.out.print("Car Name: ");
		String _name = _input.next();
		
		
		//ONE OBJECT
		Child obj = new Child(_name);

		
		
		
		System.out.println(obj.getName());
		
		
		
		//the grandparent has done the registration of the car 
		obj.setRegistered(true);			
		if(obj.isRegistered()) {
					
			//Father has done the re-registration of the car
			obj.setReRegistration(true);	
			if(obj.isReRegistration()) {
				
				System.out.println("Did you modify the car?");
				String _sModified = _input.next();
		
				if(_sModified.equals("YES") || _sModified.equals("yes")) {				
					obj.setModified(true);
					System.out.println("Great Job!");
				
				}else if(_sModified.equals("NO") || _sModified.equals("no")) {
					obj.setModified(false);
					System.out.println("No problem, you can do it now.");
				}
					
			}else {
				System.out.println("Sorry, you can not use this car.");
			}
			
			
		}else{
			
		}
		
		

		

		
		
		
		
	}

}
