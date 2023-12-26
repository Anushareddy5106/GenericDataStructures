import java.util.EmptyStackException;

public class Stack<T extends Comparable<T>> {

    LinkedList<T> list;

    Stack() {
        this.list = new LinkedList<>();
    }

    // Push
    public void push(T data) {
        list.appendAtHead(data);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        T poppedData = list.head.data;
        list.head = list.head.next;
        return poppedData;
    }

    // Peek
    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.No peek element");
        }

        return list.head.data;
    }

    public boolean isEmpty() {
        return list.head == null;
    }

    // Display the elements
    public void display() {
        Node<T> current = list.head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

}
