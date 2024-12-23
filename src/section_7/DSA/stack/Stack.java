package section_7.DSA.stack;

/**
 * @author karamanmert
 * @date 18.12.2024
 */
public class Stack {
    private int top = 0;
    int[] arr = new int[5]; // 0 0 0 0 0

    public void push(int data) {
        if (top == arr.length - 1) {
            int [] newArr = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[top] = data;
        top++;
    }

    // 1 ,2, 3
    // 1 ,2
    public int pop() {
        int data;
        top--;
        data = arr[top];
        arr[top] = 0;
        return data;
    }

    public int peek() {
        return arr[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }

    public void print() {
        for (int i = 0; i < top; i++) {
            System.out.println(i + " " + arr[i]);
        }
    }
}
