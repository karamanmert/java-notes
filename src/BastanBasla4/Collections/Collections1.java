package BastanBasla4.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Collections1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("mert");
        list.add("123");
        list.add("measdrt");
        list.add("sd");

        System.out.println(list);

        ArrayList al=new ArrayList();
        al.add("asd");
        al.add(51);
        System.out.println(al);

        Iterator itr=list.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println("-------");
        for (String s : list) {
            System.out.print(s+" ");
        }

    }
}
