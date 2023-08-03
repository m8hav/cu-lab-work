package inbuiltClasses.object;

//  YOU CAN CREATE A CLASS NAMED OBJECT BECAUSE
//  THE PACKAGE NAME WOULD BE DIFFERENT FROM DEFAULT ROOT OBJECT CLASS

import java.lang.reflect.InvocationTargetException;

public class Object implements Cloneable {

//    4 ways to create an object
//
//    - new keyword
//    - (Class)Class.forName(String packageName.className).newInstance()
//    - Cloning an object
//          - requires Cloneable Interface and clone() method
//          - creates deep copy
//    - De-serialization

    String name;

    public Object(String name) {
        this.name = name;
        System.out.println(this.name);
    }

    public Object(Object obj){
        this.name = obj.name;
        System.out.println(this.name);
    }

    public Object() {
        this.name = "Object - Default name";
        System.out.println(this.name);
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
            IllegalAccessException, CloneNotSupportedException, NoSuchMethodException, InvocationTargetException {
//        main method itself is a thread
//        1. new keyword
        Object obj1 = new inbuiltClasses.object.Object("Object 1 - new keyword");

//        2. Class.forName(String packageName.className)
//          if no arguments required
        Object obj2 = (Object)Class.forName("inbuiltClasses.object.Object").newInstance();
//          or if you want to supply arguments
        Object obj3 = (Object)Class.forName("inbuiltClasses.object.Object")
                .getConstructor(String.class).newInstance(
                        "Object 3 - Class.forName().getConstructor().newInstance()");

//        3. Cloning an object - requires Cloneable Interface
//            - using clone() method
        Object obj4 = (Object)obj1.clone();
//            - using copy constructor
        Object obj5 = new Object(obj1);
//        or
        Object obj6 = new Object((Object) obj1);

    }

    @Override
    public Object clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Object) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
