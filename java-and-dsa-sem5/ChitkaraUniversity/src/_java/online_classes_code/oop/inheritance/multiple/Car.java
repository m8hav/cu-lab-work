package _java.online_classes_code.oop.inheritance.multiple;

public class Car extends Car1 implements CompanyInterface, ProductInterface {

	private String _name;
	
	public Car() {
		//System.out.println("CAR");
	}

	@Override
	public void companyName() {
		System.out.println("HONDA");
	}

	@Override
	public void carTypes() {
		System.out.println("ELEVATE - AMAZE - CITY");
	}

	@Override
	public void productType() {
		System.out.println("SUV - SEDAN");
	}

	
	
	
}
