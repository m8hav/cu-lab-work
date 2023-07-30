package online_classes_code.oop.inheritance.multilevel;

public class Child extends Father {
	
	private boolean isModified;
	
	
	
	public Child(String _name) {
		super(_name);
	}


	//modification
	public boolean isModified() {
		return isModified;
	}

	public void setModified(boolean isModified) {
		this.isModified = isModified;
	}

	
	
	
	
	
	
	

}
