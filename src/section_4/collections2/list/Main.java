package section_4.collections2.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author karamanmert
 * @date 13.12.2024
 */
public class Main {
    public static void main(String[] args) {
        /*
        ArrayList
        Elements are sorted to adding order
        Index are used to get value
         */
        List<Integer> list = new ArrayList<>();
        list.add(312);
        list.add(456);
        list.add(789);
        list.add(23);

        System.out.println(list); // [312, 456, 789, 23]
        System.out.println(list.get(3)); // 23
        System.out.println(list.getFirst());

        System.out.println("-----------");

        List<Integer> list1 = new LinkedList<>();
        list1.add(312);
        list1.add(456);
        list1.add(789);
        list1.add(23);
        System.out.println(list1);
        System.out.println(list1.get(3));
        list1.add(0, 123);
        System.out.println(list1);

        System.out.println("-----------");


        Stack<Integer> list2 = new Stack<>();
        list2.push(123);
        list2.push(789);
        list2.push(23);
        System.out.println(list2);
        System.out.println(list2.peek());
        System.out.println(list2);
        System.out.println(list2.pop());
        System.out.println(list2);
        System.out.println(list2.search(123));
        System.out.println(list2.search(789));
    }
}

