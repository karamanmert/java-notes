package section_4.collections.course0.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author karamanmert
 * @date 13.12.2024
 */
public class Main {

    public static void main(String[] args) {
        /*
                - Collection extends Iterable
                - it has size isEmpty stream etc
                - Stream has lots of methods.
                - Collections has list, queue, set
         */


        List<Integer> list = Arrays.asList(11, 2, 33, 4, 5412, 6);
        Collection collection = list;
        collection.forEach(System.out::println);

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(11));
        list.stream().filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .forEach(System.out::println);



    }
}
