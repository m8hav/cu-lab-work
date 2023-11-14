package _java.interfaces.marker.custom.CRUDExample;

// import interfaces.marker.custom.CRUDExample.mockPackage.Updatable;
// ^ importing Updatable marker interface from another package
// i.e. same name but from different package to test if CRUD still works
// ^ it doesn't word
public class Employee implements Creatable, Readable, Updatable, Deletable {
    private static int counter;
    private final int empSerialNo;
    private String id;
    private String name;

    public Employee() {
        empSerialNo = ++counter;
    }
    public Employee(String id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    public int getSerialNo() {
        return empSerialNo;
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
        this.name = name;
    }
}
