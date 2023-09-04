package generics.genericBox.example2;

public class GenericBox<T> {
    private T [] boxData;

    public T[] getBoxData() {
        return boxData;
    }

    public void setBoxData(T[] boxData) {
        this.boxData = boxData;
    }

    public GenericBox(T[] boxData) {
        this.boxData = boxData;
    }

    public <T> void showBoxDataGeneric(T[] boxData) {
//    public <T> void showBoxData() {
        System.out.print("Generic: ");
        for (T data: boxData) {
            System.out.print(data + " ");
        }
        System.out.println();
    }
    public void showBoxDataSimple(T[] boxData) {
//    public <T> void showBoxData() {
        System.out.print("Simple: ");
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

        GenericBox <String> sObj = new GenericBox<>(item_names);
//        GenericBox <String> sObj = new GenericBox<>();
        sObj.showBoxDataGeneric(item_names);
        sObj.showBoxDataSimple(item_names);
//        sObj.showBoxData();
        sObj.inspectGeneric();
        sObj.inspectSimple();
        System.out.println();


        Double[] item_prices = {500.00, 250.00, 50.00, 100.00, 200.00};

        GenericBox <Double> dObj = new GenericBox<>(item_prices);
        dObj.showBoxDataGeneric(item_prices);
        dObj.showBoxDataSimple(item_prices);
        dObj.inspectGeneric();
        dObj.inspectSimple();

    }
}
