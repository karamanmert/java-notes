package bastan_basla_4.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("mert");
        strings.add("mert1");
        strings.add("mert2");
        strings.remove(2);
        strings.add(0,"mert5");
        strings.add(strings.size(), "mert51");
        System.out.println(strings);

        Collections.sort(strings);
        //Iterator
        /*
        Iterator iter = strings.iterator();

        while (iter.hasNext()){
            System.out.print(iter.next()+" ");
        }*/
        //foreach
        /*
        for (String s : strings){
            System.out.print(s+" ");
        }*/
        //string.forEach
        /*

        strings.forEach(System.out::println);
         */

    }
}
