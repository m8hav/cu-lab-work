package online_classes_code.oop.inheritance.multilevel;

public class Father extends GrandParent {

	private boolean reRegistration;
	
	
	public Father(String _name) {
		super(_name);
	}


	public boolean isReRegistration() {
		return reRegistration;
	}

	public void setReRegistration(boolean reRegistration) {
		this.reRegistration = reRegistration;
	}
	
	
	
	
	
	
	
	
	
}
