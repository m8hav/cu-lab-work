package java.exceptionHandling.examples;

public class ThrowsExample {
    private String name;

    public ThrowsExample(String name) {
        this.name = name;
    }

    public String getName() {
        if (name == null) {
            throw new NullPointerException("The name is null");
//            throw new NullPointerException();
        } else return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNameLength() throws NullPointerException {
        return name.length();
    }

    public int getUserDetails() throws NullPointerException {
        return getNameLength() + 10;
    }

    public static void main(String[] args) {

        String name = null;
//        name = "Brian";

        ThrowsExample obj = new ThrowsExample(name);

//        System.out.println(obj.getNameLength());
//        System.out.println(obj.getUserDetails());
        try {
//            System.out.println(obj.getName());
            System.out.println(obj.getNameLength());
            System.out.println(obj.getUserDetails());
        } catch (NullPointerException e) {
//            throw e;
            System.out.println(e);
            e.printStackTrace();
            System.out.println("OOPS! The name is null, please check it again!");
        }
    }
}
