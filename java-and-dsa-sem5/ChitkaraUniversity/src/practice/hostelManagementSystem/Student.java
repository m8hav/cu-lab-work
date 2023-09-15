package practice.hostelManagementSystem;

public class Student {
    private static int studentCounter = 0;
    private final String Id;
    private String fullName;
    private byte semester;

    public Student(String fullName, byte semester) {
        this.fullName = fullName;
        Id = "STU" + studentCounter++;
        this.semester = semester;
    }

    public Student(String fullName, int semester) {
        this(fullName, (byte) semester);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getId() {
        return Id;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(byte semester) {
        this.semester = semester;
    }
}
