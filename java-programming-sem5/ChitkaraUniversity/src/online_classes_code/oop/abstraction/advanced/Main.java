package online_classes_code.oop.abstraction.advanced;

import java.util.*;



public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = input.next();
		
		
		Platform obj = new Platform(name);
		
		
		
		
		System.out.print("URL: ");
		String url = input.next();
		obj.setPlatformUrl(url);
		
		System.out.print("Country: ");
		String country = input.next();
		obj.setPlatformCountry(country);
		
		System.out.print("Founder: ");
		String founder = input.next();
		obj.setPlatformFounder(founder);
		
		System.out.print("Founded Date: ");
		String foundedDate = input.next();
		obj.setPlatformFoundedDate(foundedDate);
		
		
		//to see all details
		obj.getAllPlatformDetails();
		
			
	}

}
