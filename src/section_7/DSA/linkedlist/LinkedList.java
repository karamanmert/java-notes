package section_7.DSA.linkedlist;

/**
 * @author karamanmert
 * @date 17.12.2024
 */
public class LinkedList {

    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void add(int data) {
        Node node = new Node();
        node.setData(data);
        node.setNext(null);

        if (getHead() == null) {
            setHead(node);
        } else {
            Node temp = head;

            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
    }

    public void addFirst(int data) {
        Node node = new Node();
        node.setData(data);
        node.setNext(getHead());
        setHead(node);
    }

    public void add(int index, int data) {
        Node node = new Node();
        node.setData(data);
        if (index == 0) {
            this.addFirst(data);
        }
        Node temp = getHead();
        for (int i = 0; i < index - 1; i++) {
            temp = temp.getNext();
        }
        node.setNext(temp.getNext());
        temp.setNext(node);
    }
    public void print() {
        Node temp = head;
        while (temp.getNext() != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
        System.out.println(temp.getData());
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}
