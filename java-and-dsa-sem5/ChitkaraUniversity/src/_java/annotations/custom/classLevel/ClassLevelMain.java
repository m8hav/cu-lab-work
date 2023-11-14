package _java.annotations.custom.classLevel;

@SuppressWarnings("unused")
public class ClassLevelMain {
    public void runProgram() {
        ToDo obj = new ToDo();

        if (obj.getClass().isAnnotationPresent(ToDoCreate.class)) {
        // ^ we mention .class in isAnnotationPresent() argument because at runtime the ToDoCreate.java annotation would get compiled to ToDoCreate.class
            obj.createToDoList();
        } else {
            obj.notAllowed();
        }
    }

    public static void main(String[] args) {
        ClassLevelMain obj = new ClassLevelMain();
        obj.runProgram();
    }
}
