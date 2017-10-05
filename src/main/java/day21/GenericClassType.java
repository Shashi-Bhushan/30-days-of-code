package day21;

public class GenericClassType <T> {

    private T item;

    GenericClassType(T item) {
        this.item = item;
    }

    public String getType() {
        return this.item.getClass().getName();
    }
}
