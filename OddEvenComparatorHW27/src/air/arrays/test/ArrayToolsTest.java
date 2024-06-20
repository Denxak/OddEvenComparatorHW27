package air.arrays.test;

import air.arrays.utils.ArrayTools;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayToolsTest {
    Integer[] origin;
    Integer[] expected;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        origin = new Integer[]{1, 4, 3, 2, 5, 6, 9, 8, 7, 3};
    }

    @Test
    void testOddEvenSort() {
        System.out.println("=== testOddEvenSort ===");
        ArrayTools.printArray(origin);
        expected = ArrayTools.oddEvenSort(origin);
        System.out.println("=== Array uto Sorting ===");
        ArrayTools.printArray(expected);
    }

    @Test
    void testOddEvenSortPlus() {
        System.out.println("=== testOddEvenSortPlus ===");
        ArrayTools.printArray(origin);
        expected = ArrayTools.oddEvenSortPlus(origin);
        ArrayTools.printArray(expected);
    }
}