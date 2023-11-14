package _java.nestedClasses.inner.anonymousClasses;

public class Anonymous {
    interface HelloWorld {

        public static final int randomStaticFinalIntVariable = 5;

        public void greetings(String greet);

        default void randomDefaultMethodInInterface() {
            System.out.println("randomDefaultMethodInInterface");
        }
    }

    public void sayHello() {

//        Simple (Local) Inner Class
        class EnglishGreeting implements HelloWorld {
            public int a = 10;
            public int m = 50;

            public void greetings(String eGreet) {
                System.out.println("English: " + eGreet);
            }

            //            cannot be made abstract here since parent class isn't abstract
            public void printHello(String hello) {
            }

            public void canAccessThisOutside() {
            }
        }
        HelloWorld englishGreeting = new EnglishGreeting();

//        Anonymous Class by implementing interface HelloWorld
        HelloWorld frenchGreeting = new HelloWorld() {
            public void greetings(String fGreet) {
                System.out.println("French: " + fGreet);
            }
        };
        HelloWorld spanishGreeting = new HelloWorld() {
            public void greetings(String sGreet) {
                System.out.println("Spanish: " + sGreet);
            }
        };
        HelloWorld germanGreeting = new HelloWorld() {
            public void greetings(String gGreet) {
                System.out.println("German: " + gGreet);
            }
        };
        HelloWorld hindiGreeting = new HelloWorld() {
            public void greetings(String hGreet) {
                System.out.println("Hindi: " + hGreet);
            }
        };

//        Anonymous Class by extending class but with reference of EnglishGreeting interface
        EnglishGreeting anonymousClassObj1 = new EnglishGreeting() {
            public int a = 200;
            public int z = 200;

            public void printHello(String str) {
                System.out.println(str);
            }

            public void greetings(String str) {
                System.out.println(str);
            }

            public void cannotAccessThisOutside() {
                System.out.println("This won't print by calling method directly");
            }

            public void canAccessThisOutside() {
                cannotAccessThisOutside();
            }
        };
//        Anonymous Class by extending class but with reference of HelloWorld Class
        HelloWorld anonymousClassObj2 = new EnglishGreeting() {
            public int a = 200;
            public int z = 200;

            public void printHello(String str) {
                System.out.println(str);
            }

            public void greetings(String str) {
                System.out.println(str);
            }

            public void cannotAccessThisOutside() {
                System.out.println("This won't print by calling method directly");
            }

            public void canAccessThisOutside() {
                cannotAccessThisOutside();
            }
        };

        englishGreeting.greetings("Hello");
        frenchGreeting.greetings("Bonjour");
        spanishGreeting.greetings("Hola");
        germanGreeting.greetings("Vodka");
        hindiGreeting.greetings("Namaste");

        anonymousClassObj1.greetings("hello");
        anonymousClassObj2.greetings("hello");

        anonymousClassObj1.printHello("hello");
//        anonymousClassObj2.printHello("hello");
//        ^ doesn't work if using reference of HelloWorld interface because method isn't declared in that interface

        System.out.println(anonymousClassObj1.a);
//        System.out.println(anonymousClassObj2.a);
//        ^ works only if field is declared in parent class/interface

        System.out.println(anonymousClassObj1.m);
//        ^ can access fields from parent class even if they aren't overridden in anonymous child
//        System.out.println(anonymousClassObj2.m);
//        ^ can't access here since it's reference of interface which doesn't have the field

//        anonymousClassObj1.cannotAccessThis();
//        anonymousClassObj2.cannotAccessThis();
//        ^ both don't work because the methods aren't declared in parent class/interface

        anonymousClassObj1.canAccessThisOutside();
//        ^ works and is able to access cannotAccessThisOutside() method even if it isn't declared in parent class/interface because it is accessed only within the anonymous class and not outside

//        anonymousClassObj2.canAccessThisOutside();
//        ^ doesn't work since method isn't declared in interface
    }

}
