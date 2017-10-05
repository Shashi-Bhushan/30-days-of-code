package day21;

import org.junit.BeforeClass;
import org.junit.Test;

public class GenericTest {

    private static String[] stringArray;
    // int can not be applied
    private static Integer[] integerArray;

    @BeforeClass
    public static void setup() {
        stringArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
        integerArray = new Integer[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9
        };
    }

    @Test
    public void print() {
        GenericArrayPrint.printArray(stringArray);
        GenericArrayPrint.printArray(integerArray);
    }

    @Test
    public void getClassType_ForInteger() {
        GenericClassType<Integer> typeOne = new GenericClassType<Integer>(1);

        assert(typeOne.getType() == "java.lang.Integer");
    }

    @Test
    public void getClassType_ForString() {
        GenericClassType<String> typeTwo = new GenericClassType<String>("Shashi");

        assert(typeTwo.getType() == "java.lang.String");
    }

    @Test
    public void compareStrings() {
        String greater = GenericCompare.findMax("Shashi", "Bhushan");

        assert(greater.equals("Shashi"));
    }

    @Test
    public void compareNumbers() {
        Integer greater = GenericCompare.findMax(0, 1);

        assert(greater.equals(1));
    }
}
