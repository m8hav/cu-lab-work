package java.getDatatype;

public class GetDatatype {
    public void runTest() {

        int a = 97;
        char b = 'b';
        GetDatatype gdObj = new GetDatatype();

        System.out.println("Objects values:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(gdObj);
        System.out.println();

        System.out.println("(Object)obj values:");
        System.out.println((Object)a);
        System.out.println((Object)b);
        System.out.println((Object)gdObj);
        System.out.println();

        System.out.println("((Object)obj).getClass() values:");
        System.out.println(((Object)a).getClass());
        System.out.println(((Object)b).getClass());
        System.out.println(((Object)gdObj).getClass());
        System.out.println();

        System.out.println("((Object)obj).getClass().getSimpleName() values:");
        System.out.println(((Object)a).getClass().getSimpleName());
        System.out.println(((Object)b).getClass().getSimpleName());
        System.out.println(((Object)gdObj).getClass().getSimpleName());
        System.out.println();

//        The Object class is the parent class of all the classes in java by default
//        It has getSimpleName() method that returns the name of the class

//        Object is the root of all inheritance hierarchies;
//        it's the only class in Java that doesn't extend another class.
    }
}
