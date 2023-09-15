package java.nestedClasses.staticAndInner;

public class StaticAndInner {

//    REFER TEXT FILES FOR FULL NOTES

//    2 categories of nested classes:
//        1. Static
//        2. Non-Static/Inner
//    Nested classes are not the same as Inner Classes.
//    Non-Static category of Nested Classes is what is also referred to as Inner Classes

//    Non-Static/Inner classes can be used to implement helper classes
//    Non-Static/Inner classes have 2 additional types:
//        2.1 Local Classes
//        2.2 Anonymous Classes

    private String companyName;
    private static String staticCompanyName;

    public class InnerNestedClass {

        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void printInfo() {
            System.out.println(age);
            System.out.println(name);
        }

        public void setOuterCompanyName(String CN) {
            companyName = CN;
        }

        public String getOuterCompanyName() {
            return companyName;
        }

        public class DoubleNestedInnerClass {
            public void show() {
                System.out.println("double nested inner class");
            }
        }

    }

    public static class StaticNestedClass {

        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void printInfo() {
            System.out.println(age);
            System.out.println(name);
        }

        public void setOuterCompanyName(String CN) {
            staticCompanyName = CN;
        }

        public String getOuterCompanyName() {
            return staticCompanyName;
        }

        public static class DoubleNestedStaticClass {
            public void show() {
                System.out.println("double nested static class");
            }
        }
    }
    public static void runInnerNestedClassPrograms() {

        System.out.println("----------------------------------------\n");
        System.out.println("Non-Static/Inner Class Updatable");
        System.out.println("----------------------------------------\n");

//        making outer class object
        StaticAndInner outerObj = new StaticAndInner();

//      making inner nested class objects
        InnerNestedClass innerNestedObj = outerObj.new InnerNestedClass();

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
        InnerNestedClass.
                DoubleNestedInnerClass doubleNestedInnerObj = innerNestedObj.new DoubleNestedInnerClass();
        doubleNestedInnerObj.show();
        System.out.println();
    }

    public static void runStaticNestedClassPrograms() {

        System.out.println("----------------------------------------\n");
        System.out.println("Static Class Updatable");
        System.out.println("----------------------------------------\n");

//        making outer class object
        StaticAndInner outerObj = new StaticAndInner();

//      making static nested class objects
        StaticNestedClass staticNestedObj = new StaticNestedClass();

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
        StaticNestedClass.DoubleNestedStaticClass
                doubleNestedStaticObj = new StaticNestedClass.DoubleNestedStaticClass();
        doubleNestedStaticObj.show();
        System.out.println();

    }

    public static void main(String[] args) {
        runInnerNestedClassPrograms();
        runStaticNestedClassPrograms();

//        SINGLE LINE INSTANTIATION
        StaticNestedClass singleLineInstantiatedStaticObj = new StaticNestedClass();
//        or
        InnerNestedClass singleLineInstantiatedInnerObj = new StaticAndInner().new InnerNestedClass();
    }

}
