package java.online_classes_code.oop.abstraction.advanced;

public interface SocialMediaPlatform {

	public static final String APPLICATION_NAME = "SOCIAL MEDIA PLATFORMS";
	
	
	//abstract methods - by default
	public String getName();
	public void setName(String name);
	
	public String getUrl();
	public void setUrl(String url);
	
	public String getCountry();
	public void setCountry(String country);
	
	public String getFounder();
	public void setFounder(String founder);
	
	public String getFoundedDate();
	public void setFoundedDate(String foundedDate);
	
	
	
	
}
