package _java.online_classes_code.oop.abstraction;

import java.util.*;



public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Platform Name: ");
		String name = input.next();
		
		
		Platform obj = new Platform(name);
		System.out.println(obj.getPlatformName());
		
		obj.getLinkedinDetails();
		
		
	}

}
