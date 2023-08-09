package interfaces.marker.inbuilt.serializableTrainersCode;

import java.io.Serializable;

public class Address implements Serializable {
	
	private String houseNo;
	private String sector;
	private String city;
	private String state;
	private String pincode;
	
	public Address(String houseNo, String sector, String city, String state, String pincode) {
		this.houseNo = houseNo;
		this.sector = sector;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	/**
	 * @return the houseNo
	 */
	public String getHouseNo() {
		return houseNo;
	}

	/**
	 * @param houseNo the houseNo to set
	 */
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	/**
	 * @return the sector
	 */
	public String getSector() {
		return sector;
	}

	/**
	 * @param sector the sector to set
	 */
	public void setSector(String sector) {
		this.sector = sector;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the pincode
	 */
	public String getPincode() {
		return pincode;
	}

	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	
	
	
	@Override
	public String toString() {
		return houseNo + ", " + sector + ", " + city + ", " + state + ", " + pincode;
		
	}
	
}
