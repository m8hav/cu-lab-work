package java.object;

class CourseShallow
{
    String subject1;
    String subject2;
    String subject3;
    public CourseShallow(String sub1, String sub2, String sub3) {
        this.subject1 = sub1;
        this.subject2 = sub2;
        this.subject3 = sub3;
    }
}

class StudentShallow implements Cloneable
{
    int id;
    String name;
    CourseShallow course;
    public StudentShallow(int id, String name, CourseShallow course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
    //Default version of clone() method. It creates shallow copy of an object.
    protected java.lang.Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ShallowCopyExample {
    public static void main(String[] args) {
        CourseShallow science = new CourseShallow("Physics", "Chemistry", "Biology");
        StudentShallow student1 = new StudentShallow(111, "John", science);
        StudentShallow student2 = null;
        try {
            //Creating a clone of student1 and assigning it to student2
            student2 = (StudentShallow) student1.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //Printing the subject3 of 'student1'
        System.out.println(student1.course.subject3);         //Output : Biology
        //Changing the subject3 of 'student2'
        student2.course.subject3 = "Maths";
        //This change will be reflected in original student 'student1'
        System.out.println(student1.course.subject3);       //Output : Maths
    }
}
