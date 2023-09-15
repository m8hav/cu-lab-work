package java.object;

//  YOU CAN CREATE A CLASS NAMED OBJECT BECAUSE
//  THE PACKAGE NAME OF THIS WOULD BE DIFFERENT FROM THAT OF DEFAULT ROOT OBJECT CLASS

import java.lang.reflect.InvocationTargetException;

public class Object implements Cloneable {

//    4 ways to create an object
//
//    - new keyword
//    - Class.forName(String packageName.className)
//    - Cloning an object
//          - requires Cloneable Interface and clone() method
//          - Oracle docs say the copy is shallow because the method creates:
//              - deep copy for primitive types and String
//              - shallow copy for non-primitive types and non-String, like objects of custom-made classes
//    - De-serialization

    String name;

    public Object(String name, int id) {
        this.name = name;
        System.out.println(this.name);
    }

    public Object(String name) {
        this(name, 0);
    }

    public Object(Object obj){
        this(obj.name);
//        this.name = obj.name;
//        System.out.println(this.name);
    }

    public Object() {
        this("Object - Default name");
//        this.name = "Object - Default name";
//        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Object{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
            IllegalAccessException, CloneNotSupportedException, NoSuchMethodException, InvocationTargetException {
//        main method itself is a thread
//        1. new keyword
        Object obj1 = new java.object.Object("Object 1 - new keyword", 2);

//        2. Class.forName(String packageName.className)
//          if no arguments required
        Object obj2 = (Object)Class.forName("java.object.Object").newInstance();
//          or if you want to supply arguments
        Object obj3 = (Object)Class.forName("java.object.Object")
                .getConstructor(String.class, int.class).newInstance(
                        "Object 3 - Class.forName().getConstructor().newInstance()", 2);

//        3. Cloning an object - requires Cloneable Interface
//            - using clone() method
        Object obj4 = (Object) obj1.clone();
        System.out.println(obj4.getName());
        obj4.setName("Object 4 - clone() method");
        System.out.println(obj4.getName());
        System.out.println("Checking obj1's name again: " + obj1.getName());
        System.out.println(obj4);
//            - using copy constructor
        Object obj5 = new Object(obj1);
//        or
        Object obj6 = new Object((Object) obj1);

    }

    @Override
    protected java.lang.Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
