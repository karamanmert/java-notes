package section_7.DSA.stack;



/**
 * @author karamanmert
 * @date 18.12.2024
 */
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.print();
        System.out.println("peeked " + stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.print();
        System.out.println(stack.isEmpty());
        stack.push(12);
        int size = stack.size();
        System.out.println(size);
        stack.push(13);
        stack.push(13);
        stack.push(13);
        stack.push(13);
        stack.push(13);
        stack.push(13);
        stack.push(13);
        stack.print();
    }
}
