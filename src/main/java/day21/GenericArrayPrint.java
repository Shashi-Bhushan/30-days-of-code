package day21;

public class GenericArrayPrint {

    private GenericArrayPrint() {

    }

    public static <T> void printArray(T[] items) {
        for(T item: items) {
            System.out.printf("%s ", item);
        }

        System.out.println();
    }

}
