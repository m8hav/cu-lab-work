package interfaces.marker.custom.CRUDExample;

//import interfaces.marker.custom.CRUDExample.mockPackage.Updatable;

public class CRUD {
    Employee emp;

    public void setEmployee(Employee emp) {
        this.emp = emp;
    }

    //    CRUD Operation - Create employee
    public int createEmployee() {
        if (emp instanceof Creatable) {
            this.emp = new Employee();
            return 1;
        }
        return 0;
    }

    //    CRUD Operation - Read employee
    public int showEmployeeInfo() {
        if (emp instanceof Readable) {
            System.out.println(emp.getSerialNo() + ". " + emp.getId() + " - " + emp.getName());
            System.out.println();
            return 1;
        }
        return 0;
    }

    //    CRUD Operation - Add employee
    public int updateEmployee(String id, String name) {
        if (emp instanceof Updatable) {
//        It's not just the name of the interface that matters. It's the actual interface with its correct fully qualified name (interface name with full package hierarchy) that does.
//          - You don't usually mention the fully qualified name for an interface or class, but I'm mentioning it below for clarification that the two interfaces below yield different results.
//        if (emp instanceof interfaces.marker.custom.CRUDExample.Updatable) {
//        if (emp instanceof interfaces.marker.custom.CRUDExample.mockPackage.Updatable){
            emp.setId(id);
            emp.setName(name);
            return 1;
        }
        return 0;
    }

    //    CRUD Operation - Delete employee
    public int deleteEmployee(String id) {
        if (emp instanceof Deletable && emp.getId() != null) {
            emp.setId(null);
            emp.setName(null);
            System.out.println("Deleting data of employee with id " + id);
            return 1;
        }
        return 0;
    }
}
