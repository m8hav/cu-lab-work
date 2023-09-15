package java.online_classes_code.oop.abstraction.advanced;


/*
 * ABSTRACT CLASS: 
 * 
 * Fields
 * Methods
 * i. Simple Methods
 * ii. Abstract Method
 * 
 */

public abstract class AbstractPlatforms implements SocialMediaPlatform{

	private String name;
	private String url;
	private String country;
	private String founder;
	private String foundedDate;
	
	
	public AbstractPlatforms(String name) {
		//System.out.println("Social Media Platforms - Linkedin");
		this.name = name;
	}

	//Not using this setName() as already setting the name via constructor
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String getUrl() {
		return url;
	}
	
	@Override
	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public String getCountry() {
		return country;
	}
	
	@Override
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String getFounder() {
		return founder;
	}
	
	@Override
	public void setFounder(String founder) {
		this.founder = founder;
	}
	
	@Override
	public String getFoundedDate() {
		return foundedDate;
	}
	
	@Override
	public void setFoundedDate(String foundedDate) {
		this.foundedDate = foundedDate;
	}
	
	
	
	
	
	//Abstract Method
	public abstract void getAllPlatformDetails();
	

	
	
}
