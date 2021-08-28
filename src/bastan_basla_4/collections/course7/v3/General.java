package bastan_basla_4.collections.course7.v3;
//compare(o1,o2)
//Compares its two arguments for order.
// Returns a negative integer, zero, or a positive integer
// as the first argument is less than, equal to, or greater than the second.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class General {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(128);
        integers.add(1121);
        integers.add(27);
        integers.add(109);
        System.out.println(integers);

        //Comparator<Integer> com = new ComparatorImpl();
        Comparator<Integer> com = (o1, o2) -> {
            if (o1 % 10 > o2 % 10)
                return 0;
            else
                return -1;
        };

        Collections.sort(integers, com); //Collection.sort(hangi collection sort edilecek, hangi koşula göre sort edilecek)
        System.out.println(integers);
    }

}
