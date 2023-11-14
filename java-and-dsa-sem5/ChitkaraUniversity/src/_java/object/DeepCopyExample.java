package _java.object;

class CourseDeep implements Cloneable
{
    String subject1;
    String subject2;
    String subject3;
    public CourseDeep(String sub1, String sub2, String sub3) {
        this.subject1 = sub1;
        this.subject2 = sub2;
        this.subject3 = sub3;
    }
    protected java.lang.Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class StudentDeep implements Cloneable
{
    int id;
    String name;
    CourseDeep course;
    public StudentDeep(int id, String name, CourseDeep course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
    //Overriding clone() method to create a deep copy of an object.
    protected java.lang.Object clone() throws CloneNotSupportedException {
        StudentDeep student = (StudentDeep) super.clone();
        student.course = (CourseDeep) course.clone();
        return student;
    }
}

public class DeepCopyExample {
    public static void main(String[] args) {
        CourseDeep science = new CourseDeep("Physics", "Chemistry", "Biology");
        StudentDeep student1 = new StudentDeep(111, "John", science);
        StudentDeep student2 = null;
        try {
            //Creating a clone of student1 and assigning it to student2
            student2 = (StudentDeep) student1.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //Printing the subject3 of 'student1'
        System.out.println(student1.course.subject3);         //Output : Biology
        //Changing the subject3 of 'student2'
        student2.course.subject3 = "Maths";
        //This change will not be reflected in original student 'student1'
        System.out.println(student1.course.subject3);       //Output : Biology
    }
}