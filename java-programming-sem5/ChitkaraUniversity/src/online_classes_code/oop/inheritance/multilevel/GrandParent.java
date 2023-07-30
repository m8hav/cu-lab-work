package online_classes_code.oop.inheritance.multilevel;

public class GrandParent {

	private String _name; 
	private boolean isRegistered;
	
	
	
	public GrandParent(String _name) {
		this._name = _name;
	}

		
	public String getName() {
		return _name;
	}

	//registration
	public boolean isRegistered() {
		return isRegistered;
	}

	public void setRegistered(boolean isRegistered) {
		this.isRegistered = isRegistered;
	}
	

}
