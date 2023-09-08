package generics.genericBox.example2;

public class GenericBox<T> {
    private T[] boxData;

    public T[] getBoxData() {
        return boxData;
    }

    public void setBoxData(T[] boxData) {
        this.boxData = boxData;
    }

    public GenericBox(T[] boxData) {
        this.boxData = boxData;
    }

//    public <T> void showBoxDataGenericNoArgs() {
////    ^ removing <T> removes error in T data
//        System.out.print("Generic: ");
//        for (T data: boxData) {
//            System.out.print(data + " ");
//        }
//        System.out.println();
//    }
    public <T> void showBoxDataGenericWithArgs(T[] boxData) {
        System.out.print("Generic: ");
        for (T data: boxData) {
            System.out.print(data + " ");
        }
        System.out.println();
    }
    public void showBoxDataSimpleNoArgs() {
        System.out.print("Simple No Args: ");
        for (T data: boxData) {
            System.out.print(data + " ");
        }
        System.out.println();
    }
    public void showBoxDataSimpleWithArgs(T[] boxData) {
        System.out.print("Simple With Args: ");
        for (T data: boxData) {
            System.out.print(data + " ");
        }
        System.out.println();
    }
    public <T> void inspectGeneric() {
        System.out.println("T Generic: " + boxData.getClass().getSimpleName());
    }
    public void inspectSimple() {
        System.out.println("T Simple: " + boxData.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        String [] item_names = {"Pizza", "Burger", "Coke", "Fries", "Wrap"};
        Double[] item_prices = {500.00, 250.00, 50.00, 100.00, 200.00};

        GenericBox <String> sObj = new GenericBox<>(item_names);
        sObj.<String>showBoxDataGenericWithArgs(item_names);
        sObj.<String>showBoxDataSimpleWithArgs(item_names);
        sObj.<String>showBoxDataSimpleNoArgs();
        sObj.<String>inspectGeneric();
        sObj.<String>inspectSimple();
        System.out.println();

        GenericBox <Double> dObj = new GenericBox<>(item_prices);
        dObj.<Double>showBoxDataGenericWithArgs(item_prices);
        dObj.<Double>showBoxDataSimpleWithArgs(item_prices);
        dObj.<Double>showBoxDataSimpleNoArgs();
        dObj.<Double>inspectGeneric();
        dObj.<Double>inspectSimple();
        System.out.println();

//        dObj.<Integer>showBoxDataGenericWithArgs(item_prices);
        dObj.<Integer>showBoxDataSimpleWithArgs(item_prices);
        dObj.<Integer>showBoxDataSimpleNoArgs();
        dObj.<Integer>inspectGeneric();
        dObj.<Integer>inspectSimple();

    }
}
