package interfaces.marker.custom.CRUDExample;

public class CRUDMain {
    public void runProgram() {
        CRUD CRUDObj = new CRUD();


        System.out.println("\n\n=====EMPLOYEE 1=====\n");
        Employee emp1 = new Employee("1234", "Bart");
        CRUDObj.setEmployee(emp1);
        CRUDObj.showEmployeeInfo();

        System.out.println("Employee Updated: " + CRUDObj.updateEmployee("10100DEV", "PHILIP"));
        CRUDObj.showEmployeeInfo();

        System.out.println("Employee Deleted: " + CRUDObj.deleteEmployee("1"));
        CRUDObj.showEmployeeInfo();


        System.out.println("\n\n=====EMPLOYEE 2=====\n");
        Employee emp2 = new Employee();
        CRUDObj.setEmployee(emp2);
        CRUDObj.showEmployeeInfo();


        System.out.println("\n\n=====EMPLOYEE 3=====\n");
        CRUDObj.createEmployee();

        System.out.println("Employee Updated: " + CRUDObj.updateEmployee("10101DEV", "RICHARD"));
        CRUDObj.showEmployeeInfo();
    }

    public static void main(String[] args) {
        CRUDMain obj = new CRUDMain();
        obj.runProgram();
    }
}
