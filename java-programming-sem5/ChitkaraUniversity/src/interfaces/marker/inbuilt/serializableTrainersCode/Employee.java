package interfaces.marker.inbuilt.serializableTrainersCode;

import java.io.Serializable;

//EmployeeDAO
public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int serial_no;
	
	private String id;
	private String name;
	
	transient private String pancard;	//don't required to be serialized
	private String aadharcard;

	private Address address;	//must be Serializable too
	
	
	//CONSTRUCTOR
	public Employee() {
		serial_no++;
	}



	//SETTERS & GETTERS
	public int getSerial_no() {
		return serial_no;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		++serial_no;
		this.name = name;
	}

	//transient
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public String getAadharcard() {
		return aadharcard;
	}
	public void setAadharcard(String aadharcard) {
		this.aadharcard = aadharcard;
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}	
	
}
