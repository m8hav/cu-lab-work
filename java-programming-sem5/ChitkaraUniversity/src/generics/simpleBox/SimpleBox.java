package generics.simpleBox;

// SIMPLE CLASS
public class SimpleBox {
    private Object object;

    public SimpleBox() {
    }

    public void set(Object object) {
        this.object = object;
    }

    public Object get() {
        return object;
    }

    public static void main(String[] args) {
        SimpleBox object = new SimpleBox();

        object.set(new String("Candy"));
//        or
//        object.set("Candy");
        System.out.println((object.get()));
        String strVal = (String) object.get();
//        ^ requires explicit casting to use values

        object.set(new Double(100.00));
//        or
//        object.set(100.0);
        System.out.println((object.get()));
        Double dblVal = (Double) object.get();
    }
}
