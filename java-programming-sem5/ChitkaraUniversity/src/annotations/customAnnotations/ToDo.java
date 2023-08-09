package annotations.customAnnotations;

@ToDoCreate
public class ToDo {
    public ToDo() {
        System.out.println("====TODO====\n");
    }
    public void createToDoList () {
        System.out.println("Creating...");
    }
    public void notAllowed() {
        System.out.println("Sorry, you are not allowed to do this.");
    }
}
