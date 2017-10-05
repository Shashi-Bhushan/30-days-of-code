package day21;

/**
 * @author Shashi Bhushan
 */
public class GenericCompare {

    public static <T extends Comparable<T>> T findMax(T firstItem, T secondItem) {
        return 0 < firstItem.compareTo(secondItem) ? firstItem : secondItem;
    }
}
