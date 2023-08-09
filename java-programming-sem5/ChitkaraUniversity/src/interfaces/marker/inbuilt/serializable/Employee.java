package interfaces.marker.inbuilt.serializable;

import java.io.Serializable;

// Employee DAO
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private int serialNo;

    private String id;
    private String name;

    transient private String panCard;   // doesn't require to be serialized
    private String aadharCard;

    private Address address;

    public Employee() {
        serialNo++;
    }

    public int getSerialNo() {
        return serialNo;
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
        ++serialNo;
        this.name = name;
    }

    public String getPanCard() {
        return panCard;
    }

    public void setPanCard(String panCard) {
        this.panCard = panCard;
    }

    public String getAadharCard() {
        return aadharCard;
    }

    public void setAadharCard(String aadharCard) {
        this.aadharCard = aadharCard;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
