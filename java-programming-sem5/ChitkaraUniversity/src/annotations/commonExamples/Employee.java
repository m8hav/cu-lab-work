package annotations.commonExamples;

@SuppressWarnings("unused")
// suppresses warnings for unused objects
public class Employee extends Salary {
    private String name;
    private int age;

    public Employee() {
    }
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Employee Class");
    }
}
