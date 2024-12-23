package section_7.DSA.linkedlist;



/**
 * @author karamanmert
 * @date 17.12.2024
 */
public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(12);
        list.add(21);
        list.add(31);
        list.add(41);
        list.addFirst(5);
        list.add(2,15);
        list.add(3,35);
        list.print();
    }
}
