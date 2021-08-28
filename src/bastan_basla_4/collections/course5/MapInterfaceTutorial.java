package bastan_basla_4.collections.course5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInterfaceTutorial {
    public static void main(String[] args) {
        System.out.println("//NON GENERIC");
        Map map = new HashMap();
        map.put(1,"mert");
        map.put(2,"asdas");
        map.put(3,1.5D);
        map.put(4,15);
        System.out.println(map);
        System.out.println(map.get(4));

        Set set = map.entrySet();
        Iterator iter = set.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next()+" ");
        }

        System.out.println("\n//GENERIC");
        Map<Integer,String> map2=new HashMap<>();
        map2.put(101,"Vijay");
        map2.put(null,null);
        map2.put(102,"Rahul");
        map2.put(100,"Amit");

        //Elements can traverse in any order
        for(Map.Entry m:map2.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        //map2.forEach((key, value) -> System.out.println(key + " " + value));
        //map2.entrySet().stream().map(m -> m.getKey() + " " + m.getValue()).forEach(System.out::println);


    }
}
