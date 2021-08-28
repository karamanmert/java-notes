package bastan_basla_4.collections.course1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//1
public class ArrayListTutorial {
    public static void main(String[] args) {
        //NON GENERIC
        System.out.println("//NON GENERIC");
        ArrayList al = new ArrayList();
        al.add("mert");
        al.add(1);
        al.add(2);
        al.add(1.5D);
        System.out.println(al);
        System.out.println(al);
        System.out.println("//remove object->give index ");
        al.remove(2);
        System.out.println(al);
        Iterator iter = al.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("********");
        System.out.println("//GENERIC");
        //GENERIC
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("mert");
        al1.add("karaman");
        al1.add("ankara");
        System.out.println(al1);

        Iterator iter2 = al1.iterator();

        while (iter2.hasNext()) {
            System.out.println(iter2.next());
        }

        System.out.println("********");
        System.out.println("//foreach");
        //GENERIC + foreach
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("elma");
        al2.add("armut");
        al2.add("muz");
        System.out.println(al2);

        for (String meyve : al2) {
            System.out.println(meyve);
        }

        System.out.println("********");
        System.out.println("********");
        System.out.println("get ve set fonksiyonu");
        ArrayList<String> al3 = new ArrayList<String>();
        al3.add("Mango");
        al3.add("Apple");
        al3.add("Banana");
        al3.add("Grapes");
        System.out.println(al3);
        al3.set(2, "KARPUZ");
        System.out.println(al3);
        System.out.println(al3.get(2));

        System.out.println("********");
        System.out.println("********");
        System.out.println("How to Sort ArrayList->Collections.sort()");
        Collections.sort(al3);
        System.out.println(al3);

        System.out.println("********");
        System.out.println("********");
        System.out.println("Add and remove array with index ");
        ArrayList<Integer> al4 = new ArrayList<>();
        al4.add(0,3);
        al4.add(1,1);
        al4.add(2,2);
        al4.add(3,5);
        al4.add(11);
        System.out.println(al4);
        Collections.sort(al4);
        System.out.print("Sorted array:");
        Iterator iter3 = al4.iterator();
        while (iter3.hasNext()){
            System.out.print(iter3.next()+" ");
        }


    }
}
