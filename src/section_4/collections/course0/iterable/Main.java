package section_4.collections.course0.iterable;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author karamanmert
 * @date 13.12.2024
 */
public class Main {

    public static void main(String[] args) {
        // ITERABLE INTERFACE
        /*
            1 - Provides forEach
            2 - Provides Iterator interface
            3 - Iterable has .iterator() method returns Iterator
            4 - Iterator has next(), hasNext(), remove()
         */
        List<Integer> list = Arrays.asList(11, 2, 33, 4, 5412, 6);
        Iterable iterable = list;
        Consumer<Integer> consumer = x -> System.out.println(x);
        // 1-
        iterable.forEach(consumer);

        // 2 & 3 & 4
        Iterator<Integer> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }

    }
}
