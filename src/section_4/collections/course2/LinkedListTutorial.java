package section_4.collections.course2;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTutorial {
    public static void main(String[] args) {
        System.out.println("//NON GENERIC");
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(1, 15);
        ll.add("mert");
        ll.add(3, "mertkaraman");
        System.out.println(ll);

        Iterator iter1 = ll.iterator();

        while (iter1.hasNext()) {
            System.out.println(iter1.next());
        }
        System.out.println("*************");
        System.out.println("*************");
        System.out.println("//GENERIC");

        LinkedList<String> ll2= new LinkedList<>();
        ll2.add("mert");
        ll2.add("karaman");
        ll2.add("corum");
        ll2.add("sungurlu");
        ll2.add(0,"ankara");
        ll2.add("sincan");
        System.out.println(ll2);
        ll2.add(0,"add first el.");
        ll2.add(ll2.size(),"add last el.");
        System.out.println(ll2);
        ll2.remove("mert");
        System.out.println("index değil de mert'i sil diyerek silmek");
        System.out.println(ll2);
        System.out.println("index vererek sil");
        ll2.remove(ll2.remove(2));
        System.out.println(ll2);
        System.out.println("get first: "+ ll2.getFirst());

        System.out.println("get last: "+ ll2.getLast());

        System.out.println("get with index: "+ll2.get(3));



    }
}
