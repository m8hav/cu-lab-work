package _java.annotations.custom.methodLevel;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodLevelMain {
    public void runProgram() throws InvocationTargetException, IllegalAccessException {
        CheckStagesBeforeTheCounterStart obj1 = new CheckStagesBeforeTheCounterStart(true);
        CheckStagesBeforeTheCounterStart obj2 = new CheckStagesBeforeTheCounterStart(false);
        for (Method method : obj1.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(OnSuperPriority.class)) {
                System.out.println(method.invoke(obj2));
//                which object to invoke the method for?
//                - pass it as an argument to invoke
            }
        }
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        MethodLevelMain obj = new MethodLevelMain();
        obj.runProgram();
    }
}
