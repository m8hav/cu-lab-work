package _java.nestedClasses.staticAndInner;

public class StaticAndInnerMain {

    //        making outer class object
    static StaticAndInner outerObj = new StaticAndInner();
    public static void runInnerNestedClassPrograms() {

        System.out.println("----------------------------------------\n");
        System.out.println("Non-Static/Inner Class Updatable");
        System.out.println("----------------------------------------\n");

//      making inner nested class objects
        StaticAndInner.InnerNestedClass innerNestedObj = outerObj.new InnerNestedClass();

        innerNestedObj.setAge(20);
        innerNestedObj.setName("Inner Bart");
        innerNestedObj.printInfo();
        System.out.println();

        System.out.println(outerObj.hashCode());
        System.out.println(innerNestedObj.hashCode());
        System.out.println();

        innerNestedObj.setOuterCompanyName("Inner BMMC");
        System.out.println(innerNestedObj.getOuterCompanyName());
        System.out.println();

//      making inner double nested class objects
        StaticAndInner.InnerNestedClass.
                DoubleNestedInnerClass doubleNestedInnerObj = innerNestedObj.new DoubleNestedInnerClass();
        doubleNestedInnerObj.show();
        System.out.println();
    }

    public static void runStaticNestedClassPrograms() {

        System.out.println("----------------------------------------\n");
        System.out.println("Static Class Updatable");
        System.out.println("----------------------------------------\n");

//      making static nested class objects
        StaticAndInner.StaticNestedClass staticNestedObj = new StaticAndInner.StaticNestedClass();

        staticNestedObj.setAge(20);
        staticNestedObj.setName("Static Bart");
        staticNestedObj.printInfo();
        System.out.println();

        System.out.println(outerObj.hashCode());
        System.out.println(staticNestedObj.hashCode());
        System.out.println();

        staticNestedObj.setOuterCompanyName("Static BMMC");
        System.out.println(staticNestedObj.getOuterCompanyName());
        System.out.println();

//      making static double nested class objects
        StaticAndInner.StaticNestedClass.DoubleNestedStaticClass
                doubleNestedStaticObj = new StaticAndInner.StaticNestedClass.DoubleNestedStaticClass();
        doubleNestedStaticObj.show();
        System.out.println();

    }

    public static void main(String[] args) {
        runInnerNestedClassPrograms();
        runStaticNestedClassPrograms();

//        SINGLE LINE INSTANTIATION
        StaticAndInner.StaticNestedClass singleLineInstantiatedStaticObj = new StaticAndInner.StaticNestedClass();
//        or
        StaticAndInner.InnerNestedClass singleLineInstantiatedInnerObj = new StaticAndInner().new InnerNestedClass();
    }
}
