package _java.interfaces.marker.inbuilt.serializable;

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

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return houseNo + ", " + sector + ", " + city + ", " + state + ", " + pincode;
    }
}
