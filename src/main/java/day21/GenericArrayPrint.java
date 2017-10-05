package day21;

public class GenericArrayPrint {

    public static <T> void printArray(T[] items) {
        for(T item: items) {
            System.out.printf(item + " ");
        }

        System.out.println();
    }

}
