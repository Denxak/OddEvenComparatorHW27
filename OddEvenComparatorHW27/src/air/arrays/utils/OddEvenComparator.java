package air.arrays.utils;

import java.util.Comparator;

public class OddEvenComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        if (a % 2 == 0 && b % 2 == 0) {
            return a.compareTo(b);
        }
        if (a % 2 != 0 && b % 2 != 0) {
            return b.compareTo(a);
        }
        if (a % 2 == 0) {
            return -1;
        }
        return 1;
    }
}
