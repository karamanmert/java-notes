package bastan_basla_4.collections.course7.v3;

import java.util.Comparator;
import java.util.Objects;

//Compares its two arguments for order.
// Returns a negative integer, zero, or a positive integer
// as the first argument is less than, equal to, or greater than the second.
public class ComparatorImpl implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (Objects.equals(o1, o2))
            return 0;
        else if (o1 > o2)
            return 1;
        else
            return -1;
    }
}
