package wrapperClasses;

// PRIMITIVE DATATYPES EXIST IN BOTH C++ AND JAVA
// BUT WRAPPER CLASSES OF DATATYPES IN JAVA MAKE IT PROPERLY OBJECT ORIENTED
// SINCE EVEN DATATYPES ARE CLASSES AND ITS INSTANCES ARE OBJECTS NOW

// FUNCTIONALITY IS STILL SAME AS PRIMITIVE DATATYPES,
// BUT SINCE JAVA IS SUPPOSED TO BE OBJECT-ORIENTED, MAKING WRAPPER CLASSES MAKES PROGRAMS PROPERLY OBJECT-ORIENTED

// Factory Methods exist for all primitive datatypes

// in Java 9, wrapper classes' constructors were deprecated
// instead, static factory methods WrapperClass.valueOf() were recommended (they existed since beginning)

// Primitive types and Wrapper Objects can be converted to each other
// using WrapperClass.valueOf(primitive datatype variable) to make Wrapper Object
// and using WrapperObject.intValue() to make Primitive type
// replace intValue() with charValue(), floatValue(), etc as per the Wrapper Class

public class WrapperClassesMain {

    public void runProgram() {
        int i = 10;
        int j = 20;
        System.out.println("Sum: " + i + j);
        System.out.println("Sum: " + (i + j));
        System.out.println();

//        direct literal
        Integer m = 10;
        Integer n = 20;
        System.out.println("Sum: " + m + n);
        System.out.println("Sum: " + (m + n));
        System.out.println();

        System.out.println("Sum: " + (i + n));
        System.out.println();

//        using new keyword and constructor
//        in Java 9, this was deprecated
//        instead, static factory methods called valueOf() were added
        Integer x = new Integer(100);
        Integer y = new Integer(10);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println();

        System.out.println("Sum: " + (x + y));
        System.out.println("Sum: " + (i + m + x));
        System.out.println();

//        using Factory Methods instead of constructor since the constructor got deprecated in Java 9
        Integer e = Integer.valueOf(1000);
        Integer f = Integer.valueOf(5000);

//        Primitive type to Wrapper Object
        int k = 5;
        Integer kObj = Integer.valueOf(k);
        System.out.println(k);
        System.out.println(kObj);
        System.out.println();

//        Wrapper Object to Primitive type
        Integer lObj = Integer.valueOf(10);
        int l = lObj.intValue();
        System.out.println(lObj);
        System.out.println(l);
        System.out.println();

    }

    public static void main(String[] args) {
        WrapperClassesMain obj = new WrapperClassesMain();
        obj.runProgram();
    }
}
