package section_7.DSA.queue;

/**
 * @author karamanmert
 * @date 18.12.2024
 */
public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(3);
        queue.enQueue(3);

        queue.print();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();

        queue.print();
    }
}
