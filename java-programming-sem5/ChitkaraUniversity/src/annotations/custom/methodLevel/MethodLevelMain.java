package annotations.custom.methodLevel;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodLevelMain {
    public void runProgram() throws InvocationTargetException, IllegalAccessException {
        CheckStagesBeforeTheCounterStart obj = new CheckStagesBeforeTheCounterStart();
        for (Method method : obj.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(OnSuperPriority.class)) {
                System.out.println(method.invoke(obj));
            }
        }
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        MethodLevelMain obj = new MethodLevelMain();
        obj.runProgram();
    }
}
