package _java.annotations.trainersCode.custom.methodlevel;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public Main() {
	}

	public static void main(String[] args) throws InvocationTargetException, IllegalAccessException  {
		
		CheckStagesBeforeTheCounterStart obj = new CheckStagesBeforeTheCounterStart();
		
		//obj.isOxygenOn();
		
		for(Method method: obj.getClass().getDeclaredMethods()) {
			
			if(method.isAnnotationPresent(OnSuperPriority.class)){
				System.out.println(method.invoke(obj)); // passing the class object - 'obj' to call the method
			}
		
		}
		
	}

}
