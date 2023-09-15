package java.marker.inbuilt.serializable;

import java.io.Serializable;

// Employee DAO
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
//    ^ doesn't get serialized because it's a static field that belongs to class and not object
    private int serialNo;

    private String id;
    private String name;

    transient private String panCard;   // doesn't require to be serialized
//    transient keyword leads to JVM saving default value of that datatype to the variable instead of the set value

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

    public String getInfo() {
        return "Employee {" +
                "\n\t serialNo = " + serialNo +
                ",\n\t id = '" + id + '\'' +
                ",\n\t name = '" + name + '\'' +
                ",\n\t panCard = '" + panCard + '\'' +
                ",\n\t aadharCard = '" + aadharCard + '\'' +
                ",\n\t address = " + address +
                "\n}";
    }
}
