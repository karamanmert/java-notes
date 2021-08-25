package bastan_Basla_4.collections.course4;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTutorial {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(11);
        hashSet.add(12);
        hashSet.add(13);
        hashSet.add(14);
        System.out.println(hashSet);
        Iterator<Integer> iter = hashSet.iterator();
        System.out.println("iterator");
        while (iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
        System.out.println("\nforeach stream");
        hashSet.forEach((Integer number) -> {
            System.out.print(number+" ");
        });
        System.out.println("\nforeach");
        for (Integer i : hashSet){
            System.out.print(i+ " ");
        }

    }
}
