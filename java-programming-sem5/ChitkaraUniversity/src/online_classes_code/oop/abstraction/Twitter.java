package online_classes_code.oop.abstraction;


/*
 * ABSTRACT CLASS: 
 * 
 * Fields
 * Methods
 * i. Simple Methods
 * ii. Abstract Method
 * 
 */

public abstract class Twitter {

	private static final String COMPLETE_NAME = "TWITTER";

	private String name;
	private String url;
	private String country;
	private String founder;
	private String foundedDate;
	
	
	public Twitter(String name) {
		System.out.println("Social Media Platforms - Linkedin");
		this.name = name;
	}
	
	//Non-Abstract Method
	public String getName() {
		return name;
	}

	
	//Abstract Method
	public abstract void getLinkedinDetails();
	

}
