package bastan_basla_4.collections.course7.v5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
    public static void main(String[] args) {
        //set interface
        //elements must be unique, you cannot dublicate elements
        Set<Integer> set = new HashSet<>();
        set.add(5); //sout(set.add(5))-> true
        set.add(6);
        set.add(9);
        //set.add(6); // DUBLICATE -> false döner
        System.out.println(set);
        System.out.println("-----------");
        System.out.println("-----------");

        //Unordered.. Eklediğin gibi çıkmaz. Cünkü arkada hasing çalışıyor.

        Set<Integer> values = new HashSet<>();
        System.out.println(values.add(87));
        System.out.println(values.add(97));
        System.out.println(values.add(34));
        System.out.println(values.add(92));
        System.out.println(values+" Unordered.. Eklediğin gibi çıkmaz. Cünkü arkada hasing çalışıyor.");

        //treeset kullanırsak, alfabetik ordera göre sıralar.. yada k->b

        Set<Integer> set1 = new TreeSet<>();
        System.out.println(set1.add(87));
        System.out.println(set1.add(97));
        System.out.println(set1.add(34));
        System.out.println(set1.add(92));
        System.out.println(set1.add(92)); //false..
        System.out.println(set1+" ->>Ordered");

    }
}
