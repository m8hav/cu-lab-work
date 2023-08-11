package annotations.trainersCode.custom.classlevel;


public class Main {

	public Main() {
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		ToDo obj = new ToDo();

		//obj.createToDoList();

		
		if(obj.getClass().isAnnotationPresent(ToDoGo.class)) {
			obj.createToDoList();
		} else {
			obj.notAllowed();
		}
		
	}

}
