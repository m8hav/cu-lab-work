package java.generics.genericBox.example1;

public class GenericBox<T> {
    private T object;
    public GenericBox() {
    }

    public void set(T object) {
        this.object = object;
    }
    public T get() {
        return object;
    }
}
