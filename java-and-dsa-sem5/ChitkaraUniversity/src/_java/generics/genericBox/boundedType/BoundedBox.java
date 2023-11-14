package _java.generics.genericBox.boundedType;

public class BoundedBox <T extends Number> {
//    ^ only accepts Number or it's subclasses
    private T[] boxData;
    public BoundedBox() {
    }

    public <T> void showBoxData(T[] boxData) {
        for(T data : boxData) {
            System.out.print(data + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Double [] item_price_in_double = {500.00, 250.00, 50.00, 100.00, 200.00};
        Integer [] item_price_in_integer = {500, 250, 50, 100, 200};

        BoundedBox <Double> dObj = new BoundedBox<>();
        dObj.<Double>showBoxData(item_price_in_double);
        System.out.println();

        BoundedBox <Integer> iObj = new BoundedBox<>();
        iObj.<Integer>showBoxData(item_price_in_integer);
        System.out.println();

        BoundedBox <Number> nObj = new BoundedBox<>();
        nObj.showBoxData(item_price_in_double);
        nObj.showBoxData(item_price_in_integer);
        System.out.println();

//        BoundedBox <String> sObj = new BoundedBox<>();
//        ^ throws compile time error because BoundedBox is bounded to type Number and it's subclasses
    }
}
