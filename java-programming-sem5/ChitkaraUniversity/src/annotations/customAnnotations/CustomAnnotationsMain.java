package annotations.customAnnotations;

@SuppressWarnings("unused")
public class CustomAnnotationsMain {
    public void runProgram() {
        ToDo obj = new ToDo();

        if (obj.getClass().isAnnotationPresent(ToDoCreate.class)) {
//            ^ we mention .class in isAnnotationPresent() argument because at runtime the ToDoCreate.java annotation would get compiled to ToDoCreate.class
            obj.createToDoList();
        } else {
            obj.notAllowed();
        }
    }

    public static void main(String[] args) {
        CustomAnnotationsMain obj = new CustomAnnotationsMain();
        obj.runProgram();
    }
}
