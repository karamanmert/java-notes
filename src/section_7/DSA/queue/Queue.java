package section_7.DSA.queue;

/**
 * @author karamanmert
 * @date 18.12.2024
 */
public class Queue {

    int capacity = 5;
    int[] queue = new int[capacity];
    int size;
    int rear;
    int front;

    public void enQueue(int data) {
        queue[rear] = data;
        rear = (rear + 1) % capacity;
        size++;
    }

    public int deQueue(){
        int data = queue[front];
        front = (front + 1) % 5;
        size--;
        return data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void print() {
        System.out.println();
        System.out.println("ELEMENTS: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % 5] + " ");
        }
        System.out.println();
        System.out.println("all els");
        for (int i : queue) {
            System.out.print(i + " ");
        }
    }
}
