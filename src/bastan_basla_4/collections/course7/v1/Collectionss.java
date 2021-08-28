package bastan_basla_4.collections.course7.v1;

import java.util.*;

public class Collectionss {
    public static void main(String[] args) {
        //ARRAY SIZE-FIXED
        //if size is fixed use array!
        System.out.println("ARRAY");
        int a[] = new int[3];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\n---------------");
        System.out.println("Collection");
        //ArrayList implments List // List extend Collection
        //NON-GENERIC.. -> type Object! thats why we can add any values type in here!
        Collection c = new ArrayList();
        c.add("5");
        c.add(1);
        c.add(5.1D);
        System.out.println(c);

        System.out.println("\n---------------");
        System.out.println("GENERIC");

        //GENERIC
        //Collection type'ı belirmek için kullanılır. WHY? type safety,
        Collection<Integer> integerCollection = new ArrayList<>();
        integerCollection.add(5);
        integerCollection.add(7);
        System.out.println(integerCollection);

        System.out.println("\n---------------");
        System.out.println("LIST");

        //WHAT IF I WANT TO ADD "6" BETWEEN 5 and 7?
        //Collection does not work with Index Numbers!!!!! -> List works with Index!
        List<Integer> lists = new ArrayList<>();
        lists.add(0, 5); //0. eleman 5
        lists.add(1, 6); //1. eleman 6
        lists.add(2, 7); //2. eleman 7
        lists.add(11);
        lists.add(21);
        lists.add(31);
        for (Integer i : lists) {
            System.out.print(i + " ");
        }

        //List has duplicate values, Set values has to be "unique".


        System.out.println("\n---------------");
        System.out.println("SET");
        //HashSet -> hashing kullanılır bu yüzden eklediğin ordered olmaz.
        Set<Integer> set = new HashSet<>();
        set.add(155);
        set.add(111);
        set.add(122);
        set.add(134);
        set.add(1511);
        System.out.println(set+" ->>random eklemiş....");
        System.out.println("Index yapısı yok. Hashing olduğu için ona göre listeledi. Ordered DEĞİL!!!!");


        System.out.println("\n---------------");
        System.out.println("SET");

        //TreeSet ile her şeyi sorted formatta alırız.
        Set<Integer> set1 = new TreeSet<>();
        set1.add(155);
        set1.add(111);
        set1.add(122);
        set1.add(134);
        set1.add(1511);
        System.out.println(set1);

        System.out.println("\n---------------");
        System.out.println("MAP");
        //Map<Key,Value> -> key unique!
        //Map interface..
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,155);
        map.put(2,111);
        map.put(3,122);
        map.put(4,134);
        map.put(5,1511);
        System.out.println(map);

    }
}
