package annotations.custom.classLevel;

//import java.lang.annotation.ElementType;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
// OR
import java.lang.annotation.*;

@Target(ElementType.TYPE)
// ^ to tell which type of element this custom annotation is for. ElementType.TYPE is used for Classes
@Retention(RetentionPolicy.RUNTIME)
// ^ to keep retention of the annotation, so it can be used and read at runtime
public @interface ToDoCreate {
}
